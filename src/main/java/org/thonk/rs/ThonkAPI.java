package org.thonk.rs;

import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import javax.ejb.EJB;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.thonk.ejb.MongoBean;
import org.thonk.entities.*;

@Path("/")
public class ThonkAPI {

    @EJB
    MongoBean mongodb;

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
    
    @PUT
    @Path("/category/{id}/parent")
    public Response updateParentCategory(@PathParam("id") String id, String parentId) {
        mongodb.updateParentCategory(id, parentId);
        return Response.status(200).build();
    }
    
    @POST
    @Path("/category/{id}/child")
    public Response addChild(@PathParam("id") String id, String childId) {
        mongodb.addChild(id, childId);
        return Response.status(200).build();
    }
    
    @POST
    @Path("/category/{id}/related/{relId}/{index}")
    public Response addRelatedToCategory(@PathParam("id") String id, 
                               @PathParam("relId") String relatedId,
                               @PathParam("relId") String index) {
        mongodb.addRelated(id, relatedId, Double.parseDouble(index));
        return Response.status(200).build();
    }
    
    @POST
    @Path("/category/{id}/paper")
    public Response addPaperToCategory(@PathParam("id") String id, 
                               @QueryParam("url") String url) {
       try {
           String urlD = URLDecoder.decode(url, "UTF-8");
           mongodb.addPaper(id, urlD);
           return Response.status(200).build();
       } catch(UnsupportedEncodingException ex) {
           return Response.status(500).entity(ex.getMessage()).build();
       }

    }
                               
                               
    @DELETE
    @Path("/category")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCategory(@PathParam("id") String id){
        mongodb.deleteCategory(id);
        return Response.status(200).build();
    }



}
