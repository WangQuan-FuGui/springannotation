package com.dream.config;

import com.dream.bean.Car;
import com.dream.bean.Cat;
import com.dream.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class MianCofig6 {

    /**
     * 第一种方式:
     * initMethod：创建bean的时候会调用，destroyMethod：销毁bean的时候会调用.
     * 但是如果是prototype的时候容器不会调用destroyMethod
     * @return
     */
    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

    /**
     * 第二种方式:
     *  这个对象实现InitializingBean接口的afterPropertiesSet方法
     *  这个对象实现DisposableBean接口的destroy方法
     *  在这个对象的这两个方法会被BeanFactory调用
     * @return
     */
    @Bean
    public Cat cat(){
        return new Cat();
    }

    /**
     * 第三种方式:
     *  可以使用JSR250(java规范)
     *  @PostConstruct 初始化
     * @PreDestroy 销毁
     */
    @Bean
    public Dog dog(){
        return new Dog();
    }

}
