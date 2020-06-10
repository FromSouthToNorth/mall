package com.hy.service;

import com.hy.entity.Users;

public interface UsersService {

    Users findByNameAndPasswordOneUser(String username, String password);

}
