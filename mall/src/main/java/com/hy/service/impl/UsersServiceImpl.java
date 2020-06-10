package com.hy.service.impl;

import com.hy.entity.Users;
import com.hy.mapper.UsersMapper;
import com.hy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users findByNameAndPasswordOneUser(String username, String password) {
        return usersMapper.findByNameAndPasswordOneUser(username, password);
    }
}
