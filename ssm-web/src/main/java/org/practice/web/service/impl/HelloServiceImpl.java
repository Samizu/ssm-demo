package org.practice.web.service.impl;

import org.practice.web.service.HelloService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.index.PathBasedRedisIndexDefinition;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by sanshui on 2018/6/7.
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public String hello() {
        redisTemplate.opsForValue().set("hello", "hello1");
        redisTemplate.expire("hello", 3, TimeUnit.MINUTES);
        return "Hello";
    }
}
