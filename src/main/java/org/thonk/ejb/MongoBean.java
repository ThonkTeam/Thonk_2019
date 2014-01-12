package org.thonk.ejb;

import javax.ejb.Stateless;

import org.thonk.entities.*;

@Stateless
public class MongoBean {

	public Category getCategoryById(Long id) {
		return new Category();
	}

}
