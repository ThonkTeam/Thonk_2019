package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "paperrefs")
public class PaperRef {
    @Id
    public String id;
    public String categoryId;
    public String parentId;
}

