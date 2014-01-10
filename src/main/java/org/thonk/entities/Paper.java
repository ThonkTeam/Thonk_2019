/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class Paper {
    
    @Id
    private Long id;
    private String url;
    
    public void setId (Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return this.url;
    }
    
}

