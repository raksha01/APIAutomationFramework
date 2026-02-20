package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.requests.LoginRequest;
import com.api.models.responses.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {
@Test
    public void getProfileInfoTest(){
        AuthService authservice = new AuthService();
        Response response = authservice.login(new LoginRequest("Raksha","Raksha@123"));
        LoginResponse loginResponse = response.as((LoginResponse.class));
        String token = loginResponse.getToken();
        System.out.println(token);

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();

    }
}
