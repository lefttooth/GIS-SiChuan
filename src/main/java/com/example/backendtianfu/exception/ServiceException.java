package com.example.backendtianfu.exception;

import lombok.Getter;

/**
 * 功能：运行服务异常
 * 作者：王佳旭lefttooth
 * 日期：2023/9/10 15:28
 */
@Getter
public class ServiceException extends RuntimeException{
    private String code;
    public ServiceException(String msg){
        super(msg);
        this.code="500";
    }
    public ServiceException(String code,String msg){
        super(msg);
        this.code=code;
    }
}

