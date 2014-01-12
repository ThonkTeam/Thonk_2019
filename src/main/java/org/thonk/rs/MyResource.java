package org.thonk.rs;

import javax.ejb.Stateless;
import javax.ejb.EJB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.thonk.ejb.MongoBean;

/**
 * Root resource (exposed at "myresource" path)
 */
@Stateless
@Path("/")
public class MyResource {

    @EJB
    MongoBean mongodb;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "fuck bitches get money";
    }

}
