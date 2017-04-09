package com.wuhulala.api.service;

import com.wuhulala.api.model.User;

import java.util.List;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public interface UserService extends CURDService<User>{
    User getUser(String username);
    public List<User> getUserList();
}
