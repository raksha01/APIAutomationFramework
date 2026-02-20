package com.api.base;

import com.api.models.requests.ForgotPasswordRequest;
import com.api.models.requests.LoginRequest;
import com.api.models.requests.ResetPasswordRequest;
import com.api.models.requests.SignUpRequest;
import io.restassured.response.Response;

import java.util.HashMap;

public class AuthService extends BaseService{
    private final static String BASE_PATH = "/api/auth";
    public Response login(LoginRequest payload){
        return postRequest(payload, BASE_PATH+"/login");
    }

    public Response signUp(SignUpRequest payload){
        return postRequest(payload, BASE_PATH+"/signup");
    }

    public Response forgotPassword(ForgotPasswordRequest payload){
        return postRequest(payload, BASE_PATH+"/forgot-password");
    }
    public Response forgotPassword(String email){
        HashMap<String,String> payload = new HashMap<String,String>();
        payload.put("email",email);
        return postRequest(payload, BASE_PATH+"/forgot-password");
    }

    public Response resetPassword(ResetPasswordRequest payload){
        return(postRequest(payload, BASE_PATH+"/reset-password"));
    }
}
