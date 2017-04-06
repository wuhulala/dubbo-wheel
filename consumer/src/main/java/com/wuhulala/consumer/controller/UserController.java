package com.wuhulala.consumer.controller;

import com.wuhulala.api.model.User;
import com.wuhulala.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{username}")
    @ResponseBody
    public User getUser(@PathVariable("username") String username){
        return userService.getUser(username);
    }
}
