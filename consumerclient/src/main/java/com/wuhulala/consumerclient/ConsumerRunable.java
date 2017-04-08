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

    public UserService userService;

    public ConsumerRunable(UserService userService){
        this.userService = userService;
    }
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        logger.debug(Thread.currentThread().getName()+"---------------------"+start+"ms");
        for (int i = 0; i < 1000; i++) {
            userService.getUser("wuhulala");
        }
        long end = System.currentTimeMillis();
        logger.debug(Thread.currentThread().getName()+"---------------------"+end+"ms");

        logger.debug(Thread.currentThread().getName()+"---------------------"+(end-start)+"ms");
    }
}
