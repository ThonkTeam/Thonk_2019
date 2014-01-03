package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class User {
    
    private Long id;
    private String dummyField;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
    
    public void setDummyField(String dummyField) {
        this.dummyField = dummyField;
    }
    
    public String getDummyField() {
        return this.dummyField;
    }
    
}

