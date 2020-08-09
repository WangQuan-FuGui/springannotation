package com.dream.config;

import com.dream.config.factorybean.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//创建一个spring定义的FactoryBean
@Configuration
public class MianCofig5 {

    @Bean
    public MyFactoryBean myFactoryBean(){

     return   new MyFactoryBean();
    }
}
