package com.mp.mptest.controller;

import com.mp.mptest.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "hello控制类")
public class HelloController {

    @PostMapping("/hello")
    @ApiOperation("hello测试")
    public String hello(@ApiParam("用户名") String username) {
        String username2 = username;
        return username2;
    }

    @PostMapping("hello2")
    public User hello2() {
        return new User();
    }

    @PostMapping("/hello3")
    @ApiOperation("post测试")
    public User hello3(@ApiParam("用户名") User user) {
        return user;
    }
}
