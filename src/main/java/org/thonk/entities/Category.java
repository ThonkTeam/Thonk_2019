/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;

import org.mongojack.DBRef;
import org.mongojack.ObjectId;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class Category {
    
    @Id
    public String id;
    public String parentCategory;
    @ObjectId
    public List<DBRef<Child, String>> children;
    @ObjectId
    public List<DBRef<Related, String>> related;
    @ObjectId
    public List<DBRef<Paper, String>> papers;
    
}
