package org.thonk.entities;

import javax.persistence.Id;
import org.mongojack.MongoCollection;

@MongoCollection(name = "paperrefs")
public class PaperRef {
    @Id
    public Long id;
    public Long categoryId;
    public Long parentId;
}

