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
@Table(name="shipping_address")
public class ShippingAddress {

    @Id
    @Column(nullable = false)
    private String id;
    @Column(length = 50,nullable = false)
    private String country;
    @Column(length = 50,nullable = false)
    private String city;
    @Column(length = 50,nullable = false)
    private String street;

    @OneToOne
    @JoinColumn(name="user_id",nullable = false,unique = true)
    private User user;

}
