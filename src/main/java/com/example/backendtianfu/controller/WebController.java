package com.example.backendtianfu.controller;


import cn.hutool.core.util.StrUtil;
import com.example.backendtianfu.common.AuthAccess;
import com.example.backendtianfu.common.Result;
import com.example.backendtianfu.entity.User;
import com.example.backendtianfu.service.UserSercive;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class WebController {
    @Resource
    UserSercive userSercive;

    @AuthAccess
    @GetMapping("/")
    public Result hello() {
        return Result.success("success");
    }

    @AuthAccess
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        if (StrUtil.isBlank(user.getUsername()) || StrUtil.isBlank(user.getPassword())) {
            return Result.error("数据输入不合法");
        }
        user = userSercive.login(user);
        return Result.success(user);
    }

    @AuthAccess
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        if (StrUtil.isBlank(user.getUsername()) || StrUtil.isBlank(user.getPassword())) {
            return Result.error("数据输入不合法");
        }
        // 判断账号密码长度
        if (user.getUsername().length() > 10 || user.getPassword().length() > 20) {
            return Result.error("数据输入不合法");
        }
        user = userSercive.register(user);
        return Result.success(user);
    }
    /**
     *  Controller重置密码
     */
    @AuthAccess
    @PutMapping("/password")
    public Result password(@RequestBody User user) {
        if (StrUtil.isBlank(user.getUsername()) || StrUtil.isBlank(user.getPhone())) {
            return Result.error("数据输入不合法");
        }
        userSercive.resetPassword(user);
        return Result.success();
    }
}
