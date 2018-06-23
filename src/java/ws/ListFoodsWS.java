/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import dao.FoodDao;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import modelo.FoodsHealth;

/**
 * REST Web Service
 *
 * @author marcelosiedler
 */
@Path("foods")
public class ListFoodsWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ListFoodDatesWS
     */
    public ListFoodsWS() {
    }

    /**
     * Retrieves representation of an instance of ws.ListFoodsWS
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/text")
     @Path("testAndFillDB/list")
    public String getJson() {
        //--------- just to populate my database--------
        // Just one Time to full fill database;
        // dao.insertTableRandomDataToBD();
        //----------------------------------------------
        return "WS RESTFULL Working ..";
    }

    @GET
    @Produces("application/json")
    @Path("TypeFoodsList/list")
    public String listFoodsInfor() {
        
        List<FoodsHealth> lisfFoodsHealth; 
        FoodDao dao = new FoodDao();
        lisfFoodsHealth = dao.listTypesFoods();

        //Convert to Gson
        Gson g = new Gson();
        return g.toJson(lisfFoodsHealth);
    }

    @GET
    @Produces("application/json")
    @Path("lessCarbohydrates/list")
    public String listFoodsInfor2() {
        
        FoodsHealth foodsHealth; 
        FoodDao dao = new FoodDao();
        foodsHealth = dao.getLessCarbohydrates();

        //Convert to Gson
        Gson g = new Gson();
        return g.toJson(foodsHealth);
    }
    
    
    
    /**
     * PUT method for updating or creating an instance of ListFoodsWS
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
