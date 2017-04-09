package com.wuhulala.consumerclient;

import com.wuhulala.api.model.User;
import com.wuhulala.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 测试泛型接口
 *
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public class ConsumerNotWeb3 {
    public static final Logger logger = LoggerFactory.getLogger(ConsumerNotWeb3.class);
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer2.xml" });
        context.start();
        UserService testService = (UserService) context.getBean("testService");

        User user = testService.get(new User("asd","asd","asd"));
        System.out.println(user);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
