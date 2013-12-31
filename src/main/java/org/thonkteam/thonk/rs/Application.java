/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thonkteam.thonk.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/**
 *
 * @author fkasoft
 */
@Path("/")
public class Application {
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "sup bros this is a test okay?";
    }
}