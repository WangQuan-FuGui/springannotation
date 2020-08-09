package com.dream.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 实现ApplicationContextAware接口
 * Aware的接口实现sspring会调用他的方法并传值
 */
public class Dog implements ApplicationContextAware {
    public ApplicationContext applicationContext;

    public Dog() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog @PreDestroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
