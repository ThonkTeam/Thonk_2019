package org.thonk.ejb;

import java.util.logging.Logger;
import javax.ejb.Stateless;

import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.ServerAddress;

import org.thonk.entities.*;

@Stateless
public class MongoBean {

    private final static Logger LOGGER = Logger.getLogger(MyClass.class.getName());

    MongoClient mongo;
    DB db; 

    public MongoBean() {
        mongo = new MongoClient(new ServerAddress("localhost", 27017));
        db = mongo.getDB("thonk");
    }

    public Category getCategoryById(Long id) {
        return new Category();
    }

}
