package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "children")
public class Children {
    @Id
    public Long id;
    public Long categoryId;
    public Long parentId;
}
