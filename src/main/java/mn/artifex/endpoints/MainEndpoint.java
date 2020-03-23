/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.artifex.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mn.artifex.entities.MainPayload;
import mn.artifex.entities.Payload;
import mn.artifex.entities.Recipient;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 * https://graph.facebook.com/<page_id>/tabs?app_id=606714240176345&method=post&access_token=EAAInzarEENkBAK9aJ07036bP9ZAozYDWkzgqHZAaoknCeo4N023BaLMXFe1iZBAndZAPrHcaoh57M8YJhe1I9lLkOjUKeV8szJx4TXTsD9EjniE47vZC7mc9FnhftSDhaevdspbPLufGZBrZAro4IQQIJaRwjNK6YxwSDGS0ZAWhZA1oZAmbPB6gQV
 */
@Path("/v1")
public class MainEndpoint {
    @POST
    @Path("/config/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MainPayload saveConfig(MainPayload mainPayload) {
        System.err.println(mainPayload);
        return mainPayload;
    }
}
