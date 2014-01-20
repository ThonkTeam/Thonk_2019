package org.thonk.ejb;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ArrayList;
import javax.annotation.PostConstruct;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.ServerAddress;
import com.mongodb.DBCollection;

import org.mongojack.DBRef;
import org.mongojack.JacksonDBCollection;

import org.thonk.entities.*;

@Stateless
public class MongoBean {

    private final static Logger log = Logger.getLogger(MongoBean.class.getName());

    MongoClient mongo;
    DB db; 

    @PostConstruct
    void init() {
          try {
              mongo = new MongoClient(new ServerAddress("localhost", 27017));
              db = mongo.getDB("thonk");
          } catch(UnknownHostException ex)  {
              log.severe(ex.getMessage());
          }
    }


    public Category getCategoryById(String id) {
        DBCollection dbCollection = db.getCollection("categories");
        JacksonDBCollection<Category, String> coll
            = JacksonDBCollection.wrap(dbCollection, Category.class, String.class);
        Category cat = coll.findOneById(id);
        return cat;
    }

    public List<Category> getChildCategories(String catId) {

        List<Category> cats = new ArrayList<>();
        DBCollection dbCollection = db.getCollection("categories");
        JacksonDBCollection<Category, String> coll 
            = JacksonDBCollection.wrap(dbCollection, Category.class, String.class);
        Category cat = coll.findOneById(catId);
        for (DBRef<Child, String> child : cat.children) {
            Category chitlinCat = coll.findOneById(child.fetch().categoryId);
            cats.add(chitlinCat);
        }
        return cats;

    }

    public List<Category> getSiblingCategories(String catId) {

        List<Category> cats = new ArrayList<>();
        DBCollection dbCollection = db.getCollection("categories");
        JacksonDBCollection<Category, String> coll
            = JacksonDBCollection.wrap(dbCollection, Category.class, String.class);
        Category cat = coll.findOneById(catId);
        for (DBRef<Related, String> relative : cat.related) {
            Category sissyCat = coll.findOneById(relative.fetch().categoryId);
            cats.add(sissyCat);
        }

        return cats;
    }



}
