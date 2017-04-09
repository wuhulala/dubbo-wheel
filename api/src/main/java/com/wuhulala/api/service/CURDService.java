package com.wuhulala.api.service;

import java.util.List;

/**
 * 增删改查接口
 *
 * @author xueaohui
 * @version 1.0
 * @date 2017/4/9
 * @link https://github.com/wuhulala
 */
public interface CURDService<T> {
    T get(T t);

    void update(T t);

    void del(T t);

    List<T> query(T t);
}
