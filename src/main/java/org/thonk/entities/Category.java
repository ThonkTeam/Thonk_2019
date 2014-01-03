/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class Category {
    
    private Long id;
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
    
}
