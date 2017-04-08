package com.wuhulala.provider.service.impl;

import com.wuhulala.api.model.User;
import com.wuhulala.api.service.UserService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setEmail("37003104"+i+"@qq.com");
            user.setPhone("1585818533"+i);
            user.setUsername("user"+i);
            users.add(user);
        }
        return users;
    }
}
