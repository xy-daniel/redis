package org.javaboy.redis;

import org.javaboy.redis.config.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisService redisUtil;


    @Test
    void contextLoads() {
        Object o = new Object();
        redisUtil.setCacheObject("111",o);
    }

}
