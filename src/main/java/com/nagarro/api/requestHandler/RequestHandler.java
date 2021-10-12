package com.nagarro.api.requestHandler;

import io.restassured.http.ContentType;

import static com.nagarro.controllers.APIController.RESPONSE;
import static io.restassured.RestAssured.given;

public class RequestHandler {

    public void request(String path, String httpType) {
        switch (httpType.toUpperCase()) {
            case "GET":
                RESPONSE = given().contentType(ContentType.JSON).get(path);
                break;
            case "POST":
                RESPONSE = given().contentType(ContentType.JSON).post(path);
                break;
        }

    }

    public void request(String path, String httpType, String body) {
        switch (httpType.toUpperCase()) {
            case "GET":
                RESPONSE = given().contentType(ContentType.JSON).body(body).when().get(path);
                break;
            case "POST":
                RESPONSE = given().contentType(ContentType.JSON).body(body).when().post(path);
                break;
        }

    }
}
