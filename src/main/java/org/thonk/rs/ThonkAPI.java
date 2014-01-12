package org.thonk.rs;

import javax.ejb.Stateless;
import javax.ejb.EJB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.thonk.ejb.MongoBean;

@Stateless
@Path("/")
public class ThonkAPI {

    @EJB
    MongoBean mongodb;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        String sent = "Any sensual bliss in the world,"
	              +"any heavenly bliss,"
                      +"isn't worth one sixteenth-sixteenth"
                      +"of the bliss of the ending of craving.";
	return sent; 
    }
}
