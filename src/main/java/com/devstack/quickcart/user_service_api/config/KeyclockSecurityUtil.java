package com.devstack.quickcart.user_service_api.config;

import jakarta.validation.Valid;
import org.keycloak.admin.client.Keycloak;

public class KeyclockSecurityUtil {

    Keycloak keycloak;

    @Valid("${keycloak.config.server-url}")
    private String serverUrl;
    @Valid("${keycloak.config.realm}")
    private String realm;
    @Valid("${keycloak.config.client-id}")

    private String clientId;
    @Valid("${keycloak.config.grant-type}")
    private String grantType;



}
