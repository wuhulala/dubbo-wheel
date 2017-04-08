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
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "consumer.xml" });
        context.start();
        UserService testService = (UserService) context.getBean("testService");
//        for (int i = 0; i < 5; i++) {
            new Thread(new ConsumerRunable(testService)).start();
//        }

//        在睡眠过程中 关掉zookeeper  仍能请求到
//        注册中心通过长连接感知服务提供者的存在，服务提供者宕机，注册中心将立即推送事件通知消费者
//        注册中心和监控中心全部宕机，不影响已运行的提供者和消费者，消费者在本地缓存了提供者列表
        Thread.sleep(10000);
        new Thread(new ConsumerRunable(testService)).start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
