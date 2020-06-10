package com.hy.controller;

import com.alibaba.fastjson.JSON;
import com.hy.dto.Result;
import com.hy.entity.Users;
import com.hy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "login", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String login(HttpServletRequest request, @RequestParam("userName") String userName, @RequestParam("password") String password) {

        Users byNameAndPasswordOneUser = usersService.findByNameAndPasswordOneUser(userName, password);

        if (byNameAndPasswordOneUser != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", byNameAndPasswordOneUser);
            return JSON.toJSONString(new Result<>(true, byNameAndPasswordOneUser));
        } else {
            return JSON.toJSONString(new Result<>(false, "用户名或密码错误！"));
        }

    }

}
