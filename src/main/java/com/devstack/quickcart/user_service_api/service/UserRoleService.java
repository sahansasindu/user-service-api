package com.devstack.quickcart.user_service_api.service;

import com.devstack.quickcart.user_service_api.dto.request.RequestUserRoleDto;
import com.devstack.quickcart.user_service_api.dto.response.ResponseUserRoleDTO;

import java.util.List;

public interface UserRoleService {
    void createUser(RequestUserRoleDto dto);

    List<ResponseUserRoleDTO> findAllUserRole();
}
