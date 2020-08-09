package com.dream.config;

import com.dream.aware.MyHelloAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 实现Aware的接口的方法都会被spring调用
 *      每一个xxxxAware都是用XXXprocessor实现的
 * EmbeddedValueResolverAware等等...
 */
@Configuration
public class MianConfig9 {

    @Bean
    public MyHelloAware myHelloAware(){
        return new MyHelloAware();
    }
}
