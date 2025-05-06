package com.devstack.quickcart.user_service_api.service;

import com.devstack.quickcart.user_service_api.dto.request.RequestUserAvatarDto;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;

public interface SystemUserAvatarService {
    void createSystemUserAvatar(RequestUserAvatarDto dto, String email, MultipartFile file) throws SQLException;
}
