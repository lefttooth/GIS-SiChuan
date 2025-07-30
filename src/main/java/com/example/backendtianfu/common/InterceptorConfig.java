package com.example.backendtianfu.common;

/**
 * 功能：拦截器规则
 * 作者：王佳旭lefttooth
 * 日期：2023/9/10 16:52
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor()) //配置jwt拦截器规则
                .addPathPatterns("/**")//拦截所有请求路径
                .excludePathPatterns("/login","/register"); //放行登录
        super.addInterceptors(registry);
    }

    @Bean
    public JwtInterceptor jwtInterceptor() {
        return new JwtInterceptor();
    }

}
