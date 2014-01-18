package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "siblings")
public class Siblings {
    @Id
    public String id;
    public String categoryId;
    public Float relationIndex;
}

