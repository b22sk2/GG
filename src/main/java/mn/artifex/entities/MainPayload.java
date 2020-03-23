/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.artifex.entities;

import java.util.List;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
public class MainPayload {

    String account_id;
    String page_access_token;
    String page_id;

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }
    List<Menu> menu;

    public MainPayload(String account_id, String page_access_token, String page_id) {
        this.account_id = account_id;
        this.page_access_token = page_access_token;
        this.page_id = page_id;
    }

    public MainPayload() {
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getPage_access_token() {
        return page_access_token;
    }

    public void setPage_access_token(String page_access_token) {
        this.page_access_token = page_access_token;
    }

    public String getPage_id() {
        return page_id;
    }

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

}
