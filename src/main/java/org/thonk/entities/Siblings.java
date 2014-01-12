package org.thonk.entities;

import org.mongojack.MongoCollection;

@MongoCollection("siblings")
public class Siblings {
    @Id
    public Long id;
    public Long categoryId;
    public Float relationIndex;
}

