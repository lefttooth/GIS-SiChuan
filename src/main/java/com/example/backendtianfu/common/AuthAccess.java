package com.example.backendtianfu.common;

import java.lang.annotation.*;
//自定义注解 token放行注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAccess {
}
