package com.dream.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean, DisposableBean {
    public Cat(){
        System.out.println("Cat contructor");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet");
    }
}
