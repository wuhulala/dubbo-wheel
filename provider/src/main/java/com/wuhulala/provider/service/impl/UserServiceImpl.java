package com.wuhulala.provider.service.impl;

import com.wuhulala.api.model.User;
import com.wuhulala.api.service.UserService;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public class UserServiceImpl implements UserService {
    public User getUser(String username) {
        System.out.println("-----调用服务-----【"+username+"】");
        return new User(username,"370031044@qq.com","1585818533");
    }
}
