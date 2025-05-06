package com.devstack.quickcart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")

public class User {

    @Id
    @Column(unique = true,nullable = false,name="user_id")
    private String userId;
    @Column(unique = true,nullable = false,name ="user_name",length = 100)
    private String userName;
    @Column(name = "first_name",length = 50,nullable = false)
    private String firstName;
    @Column(name = "last_name",length = 50,nullable = false)
    private String lastName;
    @Column(name = "active_status",columnDefinition = "TINYINT")
    private boolean activeState;

    @OneToOne(mappedBy = "user")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "user")
    private BillingAddress billingAddress;

    @OneToOne(mappedBy = "user")
    private UserAvatar userAvatar;

    @OneToOne(mappedBy ="systemUser",fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private Otp otp;



}
