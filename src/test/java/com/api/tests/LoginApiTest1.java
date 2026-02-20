package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.responses.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApiTest1 {
    @Test
    public void loginTest(){
        LoginRequest  loginRequest= new LoginRequest("Raksha","Raksha@1234");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        System.out.println(response.asPrettyString());
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getId());
        System.out.println(loginResponse.getEmail());
        System.out.println(loginResponse.getRoles());

        Assert.assertTrue(loginResponse.getToken()!=null);
        Assert.assertEquals(loginResponse.getEmail(), "rakshu2422@gmail.com");

    }
}
