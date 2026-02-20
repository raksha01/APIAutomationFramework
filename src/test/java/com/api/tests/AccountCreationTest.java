package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.SignUpRequest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest {
    @Test
    public void createAccountTest(){
        SignUpRequest signUpRequest = new SignUpRequest.Builder()
                .username("dcba")
                .email("rakshaa2727@Gmail.com")
                .firstName("Raksha123")
                .password("Raksha123")
                .lastName("Agrawal")
                .mobileNumber("9876543210")
                .build(); //creating an object for innerclass
        AuthService authService = new AuthService();
        Response response = authService.signUp(signUpRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"Error: Username is already taken!");

    }
}
