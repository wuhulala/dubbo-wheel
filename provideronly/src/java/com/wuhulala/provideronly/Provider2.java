package com.wuhulala.provideronly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/6
 * @link https://github.com/wuhulala
 */
public class Provider2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"provider2.xml"});
        context.start();
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
