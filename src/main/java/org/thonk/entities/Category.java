/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
import org.mongojack.DBRef;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class Category {
    
    @Id
    private Long id;
    private Long parentCategory;
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setParentCategory(Long parentCategory) {
        this.parentCategory = parentCategory;
    }
    
    public Long getParentCategory() {
        return this.parentCategory
    }
    
    public List<DBRef<Children, Long>> children;
    public List<DBRef<Siblings, Long>> siblings;
    
    
}
