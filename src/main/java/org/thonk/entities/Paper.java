/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.thonk.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Id;

import org.mongojack.MongoCollection;

@MongoCollection(name = "papers")
public class Paper {
    @Id
    public String id;
    public String url;
}

