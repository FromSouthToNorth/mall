package com.hy.mapper;

import com.hy.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {

    Users findByNameAndPasswordOneUser(@Param("userName") String username, @Param("password") String password);

}
