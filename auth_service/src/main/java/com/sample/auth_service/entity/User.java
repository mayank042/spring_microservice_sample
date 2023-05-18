package com.sample.auth_service.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "Email")
    private String email;

    @Size(max = 255)
    @Column(name = "Password")
    private String password;

    @Size(max = 255)
    @Column(name = "Role")
    private String role;
}
