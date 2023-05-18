package com.sample.auth_service.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AuthenticationRequest {

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
