/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.artifex.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
@Path("v1/hook")
public class MessengerEndpoint {

    @GET
    public Response getWebHook(@QueryParam("hub.challenge") String challenge) {
        return Response.ok(challenge).build();
    }

    @POST
    public Response get(String string) {
        System.out.println(string);
        return Response.ok("").build();
    }
}
