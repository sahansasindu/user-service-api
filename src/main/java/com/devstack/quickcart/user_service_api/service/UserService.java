package com.devstack.quickcart.user_service_api.service;

import com.devstack.quickcart.user_service_api.dto.request.RequestUserDto;
import com.devstack.quickcart.user_service_api.dto.request.RequestUserLoginRequest;
import com.devstack.quickcart.user_service_api.dto.request.RequestUserPasswordResetDto;

import java.io.IOException;

public interface UserService {

    public void createUser(RequestUserDto dto)throws IOException;
    public boolean verifyEmail(String otp,String email);
    public Object userLogin(RequestUserLoginRequest request);
    public boolean verifyReset(String otp,String email);
    public boolean passwordReset(RequestUserPasswordResetDto resetDto);
}
