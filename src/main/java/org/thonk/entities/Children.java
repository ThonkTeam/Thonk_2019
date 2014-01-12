package org.thonk.entities;

import org.mongojack.MongoCollection;

@MongoCollection("children")
public class Children {
    @Id
    public Long id;
    public Long categoryId;
    public Long parentId;
}
