package com.wuhulala.consumerclient.service.impl;

import com.wuhulala.api.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/8
 * @link https://github.com/wuhulala
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public void test() {
        System.out.println("test........");
    }
}
