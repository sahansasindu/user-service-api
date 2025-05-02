package com.devstack.quickcart.user_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="billing_address")
public class BillingAddress {
    @Id
    @Column(nullable = false)
    private String id;
    @Column(length = 50,nullable = false)
    private String country;
    @Column(length = 50,nullable = false)
    private String city;
    @Column(length = 50,nullable = false)
    private String street;
}
