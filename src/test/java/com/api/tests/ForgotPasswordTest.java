package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.ResetPasswordRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
    @Test
    public void forgotPasswordTest(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("rakshu2422@gmail.com");
        System.out.println(response.asPrettyString());
    }
    @Test
    public void resetPasswordTest(){
        ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest("df4ae9ee-fb2c-4db9-b8c3-1ceccf7ad2db","Raksha@123","Raksha@123");
        AuthService authService = new AuthService();
        Response response = authService.resetPassword(resetPasswordRequest);
        System.out.println(response.asPrettyString());
    }
}
