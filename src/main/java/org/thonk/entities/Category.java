/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;

import org.mongojack.DBRef;
import org.mognojack.ObjectId;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class Category {
    
    @Id
    public Long id;
    public Long parentCategory;
    @ObjectId
    public List<DBRef<Children, Long>> children;
    @ObjectId
    public List<DBRef<Siblings, Long>> siblings;
    
}
