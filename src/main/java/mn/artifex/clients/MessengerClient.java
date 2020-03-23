package mn.artifex.clients;

import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
@RegisterRestClient(baseUri = "https://graph.facebook.com/v6.0/me/messages")
public interface MessengerClient {
    
    @POST
    public String sendMessage(@QueryParam("access_token") String token, MessengerPayload payload);
}
