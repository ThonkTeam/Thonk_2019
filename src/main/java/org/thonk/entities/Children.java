package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "children")
public class Children {
    @Id
    public String id;
    public String categoryId;
    public String parentId;
}
