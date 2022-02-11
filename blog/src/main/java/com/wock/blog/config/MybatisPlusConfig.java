package com.wock.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.wock.blog.mapper")
//相关接口全都写到mapper文件夹下,方便扫描到,生成代理实现类,并且注册到spring容器里面去
public class MybatisPlusConfig {

    //    分页插件,先定义一个拦截器
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
         MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
         interceptor.addInnerInterceptor(new PaginationInnerInterceptor()); //分页插件
         return interceptor;
    }
}
