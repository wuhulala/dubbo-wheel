package com.wuhulala.consumer;

import com.wuhulala.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public class Bootstrap {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer.xml" });
        context.start();
        UserService testService = (UserService) context.getBean("testService");
        System.out.println(testService.getUser("wuhulala"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
