package com.devstack.quickcart.user_service_api.service.impl;

import com.devstack.quickcart.user_service_api.dto.request.RequestUserDto;
import com.devstack.quickcart.user_service_api.dto.request.RequestUserLoginRequest;
import com.devstack.quickcart.user_service_api.dto.request.RequestUserPasswordResetDto;
import com.devstack.quickcart.user_service_api.dto.response.ResponseUserDto;
import com.devstack.quickcart.user_service_api.service.UserService;

import java.io.IOException;
import java.util.List;

public class UserserviceImpl implements UserService {
    @Override
    public void createUser(RequestUserDto dto) throws IOException {

    }

    @Override
    public boolean verifyEmail(String otp, String email) {
        return false;
    }

    @Override
    public Object userLogin(RequestUserLoginRequest request) {
        return null;
    }

    @Override
    public List<ResponseUserDto> findUsersPaginate(String searchText, int page, int size) {
        return null;
    }

    @Override
    public boolean verifyReset(String otp, String email) {
        return false;
    }

    @Override
    public boolean passwordReset(RequestUserPasswordResetDto resetDto) {
        return false;
    }

    @Override
    public String getUserId(String email) {
        return null;
    }
}
