package com.sample.auth_service.controller;

import com.sample.auth_service.controller.request.AuthenticationRequest;
import com.sample.auth_service.entity.User;
import com.sample.auth_service.service.UserService;
import com.sample.auth_service.util.CryptoUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<String> authenticateUser(
            @Valid @RequestBody AuthenticationRequest request
    ) {

        User user = userService.getUserByEmail(request.getEmail());

        // CryptoUtil.java - see it in source code
        //
        if (request.getPassword().equals(CryptoUtil.decrypt(user.getPassword()))) {

            // password matched, we can generate JWT

        }

        // todo: Generate JWT
        return null;
    }
}
