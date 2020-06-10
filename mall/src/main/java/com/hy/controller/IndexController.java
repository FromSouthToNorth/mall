package com.hy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "myCenter", method = RequestMethod.GET)
    public String myCenter(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "user/myCenter";
        } else {
            return "login/login";
        }
    }

}
