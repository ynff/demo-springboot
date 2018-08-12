package com.blj.controller;


import com.blj.pojo.Doctor;
import com.blj.pojo.Result;
import com.blj.pojo.User;
import com.blj.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;

/**
 * Created by blj on 2017/10/31.
 */
@Api("我的测试")
@RestController
@RequestMapping("/blj")
public class TestController {
    @Autowired
    private ITestService service;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private JedisPool jedisPool;
    @ApiOperation("新建User")
    @GetMapping("/test")
    public List<Doctor> test(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = false) Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        List<Doctor> doctors = service.queryDoctor();
        return null;

    }
    @ApiOperation("批量修改")
    @GetMapping("/update")
    public List<User> updateUser(){
        //List<User> users = service.updateUsers();
        return null;
    }

    @ApiOperation("测试redisTemplate")
    @GetMapping("/redis")
    public Result testRedisTemplate(@RequestParam(name = "value")String value){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("test1",value);
        return Result.ok(valueOperations.get("test1"));
    }
    @ApiOperation("测试redisTemplate")
    @GetMapping("/redis/jedis")
    public Result testJedisPool(@RequestParam(name = "value")String value){
        Jedis jedis = jedisPool.getResource();
        jedis.set("test2",value);
        return Result.ok(jedis.get("test1"));
    }
}

