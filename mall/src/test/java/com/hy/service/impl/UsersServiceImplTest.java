package com.hy.service.impl;

import com.hy.BaseTest;
import com.hy.service.UsersService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersServiceImplTest extends BaseTest {

    @Autowired
    private UsersService usersService;

    @Test
    public void loginTest() {
        System.out.println(usersService.findByNameAndPasswordOneUser("test1", "123"));
    }

}
