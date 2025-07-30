package com.example.backendtianfu.exception;

import com.example.backendtianfu.common.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能：全局异常
 * 作者：王佳旭lefttooth
 * 日期：2023/9/10 15:25
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result serviceException(ServiceException e){
        return Result.error(e.getCode(),e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result globalException(ServiceException e){
        e.printStackTrace();
        return Result.error("500","系统错误");
    }
}
