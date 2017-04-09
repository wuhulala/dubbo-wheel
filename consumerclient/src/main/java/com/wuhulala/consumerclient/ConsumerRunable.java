package com.wuhulala.consumerclient;

import com.wuhulala.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/8
 * @link https://github.com/wuhulala
 */
public class ConsumerRunable implements Runnable{
    public static final Logger logger = LoggerFactory.getLogger(ConsumerRunable.class);

    private UserService userService;

    private int count;

    public ConsumerRunable(UserService userService){
        this.userService = userService;
        this.count = 1000;
    }

    public ConsumerRunable(UserService userService,int count){
        this.userService = userService;
        this.count = count;
    }
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        logger.debug(Thread.currentThread().getName()+"---------------------"+start+"ms");
        for (int i = 0; i < count; i++) {
            userService.getUser("wuhulala");
        }
        long end = System.currentTimeMillis();
        logger.debug(Thread.currentThread().getName()+"---------------------"+end+"ms");

        logger.debug(Thread.currentThread().getName()+"---------------------"+(end-start)+"ms");
    }
}
