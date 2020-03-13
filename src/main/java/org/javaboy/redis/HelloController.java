package org.javaboy.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;

    //set方法坠入变量
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate){
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @GetMapping("/set")
    public void set(){
        ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
        opsForValue.set("name", "DDG");
    }

    @GetMapping("/get")
    public String get(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        return stringStringValueOperations.get("name");
    }
}
