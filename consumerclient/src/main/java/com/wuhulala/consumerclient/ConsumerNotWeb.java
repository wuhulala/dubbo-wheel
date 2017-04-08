package com.wuhulala.consumerclient;

import com.wuhulala.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public class ConsumerNotWeb {
    public static final Logger logger = LoggerFactory.getLogger(ConsumerNotWeb.class);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer.xml" });
        context.start();
        UserService testService = (UserService) context.getBean("testService");
//        for (int i = 0; i < 5; i++) {
            new Thread(new ConsumerRunable(testService)).start();
//        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
