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
@Table(name="user_avatar")
public class UserAvatar {

    @Id
    @Column(nullable = false)
    private String avatarid;
    @Embedded
    private FileResource fileResource;
}
