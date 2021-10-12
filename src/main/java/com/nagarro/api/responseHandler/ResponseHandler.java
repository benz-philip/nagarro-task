package com.nagarro.api.responseHandler;

import java.util.List;

import static com.nagarro.controllers.APIController.RESPONSE;

public class ResponseHandler {

    public int getStatusCode() {
        return RESPONSE.getStatusCode();
    }

    public Object getResponseValue(String key) {
        return RESPONSE.getBody().jsonPath().get(key);
    }
    public int getObjectSize(String key) {
        return RESPONSE.getBody().jsonPath().getList(key).size();}
}
