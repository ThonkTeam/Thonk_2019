package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BHowden
 */
@XmlRootElement
public class User {
    
    public Long id;
    public String email;
    public String avatar;
    
}

