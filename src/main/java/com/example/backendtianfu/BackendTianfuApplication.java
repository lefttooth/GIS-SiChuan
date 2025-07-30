package com.example.backendtianfu;

import com.example.backendtianfu.entity.User;
import com.example.backendtianfu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class BackendTianfuApplication {



    public static void main(String[] args) {
        SpringApplication.run(BackendTianfuApplication.class, args);
    }

}
