package com.wock.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //    跨域配置
        registry.addMapping("/**").allowedOrigins("http:localhost:8080");//前后端端口不能设置成一样.两个服务不能同时访问一个端口,否则会冲突
    }
}
