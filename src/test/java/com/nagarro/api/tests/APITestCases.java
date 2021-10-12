package com.nagarro.api.tests;

import com.google.gson.JsonObject;
import com.nagarro.controllers.APIController;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class APITestCases extends APIController {

    @Test
    @Parameters({"statusCode", "userId", "name"})
    public void firstTest(int statusCode, int userId, String name) {
        requestHandler.request("/users?page=2", "GET");
        assertEquals(responseHandler.getStatusCode(), statusCode);
        int allValues = responseHandler.getObjectSize("data");
        for (int i = 0; i < allValues; i++) {
            if (responseHandler.getResponseValue("data[" + i + "].id").equals(userId)) {
                assertEquals(responseHandler.getResponseValue("data[" + i + "].first_name").toString(), name);
                break;
            }
        }
    }

    @Test
    @Parameters({"name", "job", "statusCode"})
    public void secondTest(String name, String job, int statusCode) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("job", job);
        requestHandler.request("/users", "POST", jsonObject.toString());
        assertEquals(responseHandler.getStatusCode(), statusCode);
        assertNotNull(responseHandler.getResponseValue("id"));
        assertEquals(responseHandler.getResponseValue("job"), job);
        assertEquals(responseHandler.getResponseValue("name"), name);
    }

}
