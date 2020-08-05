package com.dream.config;

import com.dream.config.factorybean.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MianCofig5 {

    @Bean
    public MyFactoryBean myFactoryBean(){

     return   new MyFactoryBean();
    }
}
