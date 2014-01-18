package org.thonk.entities;
 
import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "related")
public class Related {
    @Id
    public String id;
    public String categoryId;
    public Double relationIndex;
}

