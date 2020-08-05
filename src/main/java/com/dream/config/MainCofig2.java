package com.dream.config;

import com.dream.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainCofig2 {

    /**
     * Scope:
     * prototype 多实例
     * singleton 单实例
     * request 同一次请求创建一个实例
     * session 同一个session创建一个实例
     * @return
     */
   // @Scope("prototype")
    @Lazy //懒加载，第一次获取的时候获取的时候创建配合单实例使用
    @Bean //默认是单例的
    public Person person(){
        return new Person("zhangsan",18);
    }
}
