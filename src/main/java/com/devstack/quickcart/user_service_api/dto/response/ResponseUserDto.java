package com.devstack.quickcart.user_service_api.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class ResponseUserDto {

    private String userName;
    private String firstName;
    private String lastName;
    private boolean activeSate;
    private ResponseUserAvatarDto avatarDto;
    private ResponseBillingAddressDto billingAddressDto;
    private ResponseShippingAddressDto shippingAddressDto;

}
