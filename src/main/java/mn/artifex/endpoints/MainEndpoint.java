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

import mn.artifex.clients.GraphApi;
import mn.artifex.entities.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baasankhuu.d@corp.unitel.mn
 * https://graph.facebook.com/<page_id>/tabs?app_id=606714240176345&method=post&access_token=EAAInzarEENkBAK9aJ07036bP9ZAozYDWkzgqHZAaoknCeo4N023BaLMXFe1iZBAndZAPrHcaoh57M8YJhe1I9lLkOjUKeV8szJx4TXTsD9EjniE47vZC7mc9FnhftSDhaevdspbPLufGZBrZAro4IQQIJaRwjNK6YxwSDGS0ZAWhZA1oZAmbPB6gQV
 */
@Path("/v1")
public class MainEndpoint {
    @RestClient
    GraphApi graphApi;

    @POST
    @Path("/config/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MainPayload saveConfig(MainPayload mainPayload) {
        subscribeEvents(mainPayload);
        setPersistentMenu(mainPayload);
        return mainPayload;
    }

    public void subscribeEvents(MainPayload mainPayload) {
        //messages,messaging_postbacks,messaging_handovers,message_reactions
        String response = graphApi.subscribeEvents(mainPayload.getPage_id(), mainPayload.getPage_access_token(), "messages,messaging_postbacks,messaging_handovers,message_reactions");
        System.err.println(response);
    }

    public void setPersistentMenu(MainPayload mainPayload) {
        List<Menu> menus = mainPayload.getMenu();
        List<Button> buttons = new ArrayList<>();
        PersisitentMenu persistentMenu = new PersisitentMenu();
        for (Menu menu : menus) {
            Button button = new Button();
            button.setTitle(menu.getTitle());
            if (menu.getPayload().getType().equals("callback")) {
                button.setType("postback");
                button.setPayload(menu.getPayload().getCallback().getUrl() + "?id" + menu.getPayload().getCallback().getParameters().getId());
            } else {
                button.setUrl(menu.getPayload().getUrl());
            }
            buttons.add(button);
        }
        persistentMenu.setPersistentMenu(buttons);
        String response = graphApi.setPersisitentMenu(mainPayload.getPage_id(), mainPayload.getPage_access_token(), persistentMenu);
        System.out.println(response);

    }
}
