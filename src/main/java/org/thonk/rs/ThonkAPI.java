package org.thonk.rs;

import javax.ejb.Stateless;
import javax.ejb.EJB;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.thonk.ejb.MongoBean;
import org.thonk.entities.*;

@Stateless
@Path("/")
public class ThonkAPI {

    @EJB
    MongoBean mongo;

    @POST
    @Path("/category")
    public Response createCategory(Category cat){
        String id = mongodb.createCategory(cat);
        return Response.status(200).entity(id).build();
    }

    @GET
    @Path("/category/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category readCategory(@PathParam("id") String id){
        return mongodb.readCategory(id);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCategory(@PathParam("id") String id){
        mongodb.deleteCategory(id);
        return Response.status(200).build();
    }



}
