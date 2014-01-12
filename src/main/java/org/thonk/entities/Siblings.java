package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "siblings")
public class Siblings {
    @Id
    public Long id;
    public Long categoryId;
    public Float relationIndex;
}

