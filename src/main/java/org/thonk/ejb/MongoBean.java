package org.thonk.ejb;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.ServerAddress;
import com.mongodb.DBCollection;

import org.mongojack.JacksonDBCollection;

import org.thonk.entities.*;

@Stateless
public class MongoBean {

    private final static Logger log = Logger.getLogger(MongoBean.class.getName());

    MongoClient mongo;
    DB db; 

    public MongoBean() {
        try {
            mongo = new MongoClient(new ServerAddress("localhost", 27017));
            db = mongo.getDB("thonk");
        } catch(UnknownHostException ex)  {
            log.severe(ex.getMessage());
        }
    }

    public Category getCategoryById(String id) {
        DBCollection dbCollection = db.getCollection("categories");
        JacksonDBCollection<Category, String> coll = JacksonDBCollection.wrap(dbCollection, Category.class, String.class);
        Category cat = coll.findOneById(id);
        return cat;
    }

}
