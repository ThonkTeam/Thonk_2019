package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;
/**
 *
 * @author BHowden
 */
@XmlRootElement
public class User {
    @Id
    public Long id;
    public String email;
    public String avatar;
    
}

