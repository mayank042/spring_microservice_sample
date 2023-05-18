package com.sample.auth_service.service;

import com.sample.auth_service.entity.User;

public interface UserService {

    User getUserByEmail(String email);
}
