package com.nagarro.controllers;

import com.nagarro.api.requestHandler.RequestHandler;
import com.nagarro.api.responseHandler.ResponseHandler;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;

public class APIController {
    public static Response RESPONSE;
    public ResponseHandler responseHandler = new ResponseHandler();
    public RequestHandler requestHandler = new RequestHandler();

    @BeforeMethod
    public void beforeMethod() {
        RestAssured.baseURI = "https://reqres.in/api";
    }
}
