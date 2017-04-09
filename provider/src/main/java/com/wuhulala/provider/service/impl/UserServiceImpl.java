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
    private int count = 0;

    public User getUser(String username) {
        System.out.println(++count+"-----调用服务-----【"+username+"】");
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

    @Override
    public User get(User user) {
        return new User("test","370031044@qq.com","15858185333");
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void del(User user) {

    }

    @Override
    public List<User> query(User user) {
        return null;
    }
}
