package com.dream.config;

import com.dream.bean.Car;
import com.dream.bean.Cat;
import com.dream.bean.Dog;
import com.dream.bean.MyPostProcessor;
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
     *  在类的方法上加上以下注解:
     *  @PostConstruct 初始化
     * @PreDestroy 销毁
     */
    @Bean
    public Dog dog(){
        return new Dog();
    }

    /**
     * 第四种方式:
     * 作用在所有bean上.
     *      BeanPostProcessor接口是bean的后置处理器.
     *  在bean的初始化前后，进行处理操作.
     *  postProcessBeforeInitialization：bean初始化之前进行加工处理。
     *  postProcessAfterInitialization：bean初始化之后进行加工处理。 ·
     *
     *  实现ApplicationContextAware接口的setApplicationContext方法会被ApplicationContextAwareProcessor
     *  类加载装配IOC容器
     */

    @Bean
    public MyPostProcessor postProcessor(){
        return new MyPostProcessor();
    }

}
