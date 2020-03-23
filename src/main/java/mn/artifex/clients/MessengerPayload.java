/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.artifex.clients;

import mn.artifex.entities.Recipient;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
class MessengerPayload {
    Recipient recipient;

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }
    String messaging_type = "RESPONSE";
    Object message;

    public MessengerPayload() {
    }

    public String getMessaging_type() {
        return messaging_type;
    }

    public void setMessaging_type(String messaging_type) {
        this.messaging_type = messaging_type;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
    
}
