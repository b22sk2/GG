package mn.artifex.clients;

import mn.artifex.entities.PersisitentMenu;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://graph.facebook.com/v6.0/")
public interface GraphApi {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{page_id}/messenger_profile")
    public String setPersisitentMenu(@PathParam("page_id") String page_id, @QueryParam("access_token") String access_token, PersisitentMenu menu);
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{page_id}/subscribed_apps")
    public String subscribeEvents(@PathParam("page_id") String page_id, @QueryParam("access_token") String access_token, @QueryParam("subscribed_fields") String subscribed_fields);
}
