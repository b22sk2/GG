package mn.artifex.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HttpClient {
    public static String send(String url) {
        Client client = ClientBuilder.newClient();
        Response r = client.target(url).request().get();
        return "";
    }
}
