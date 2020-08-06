package com.dream.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {

    public Dog(){}

    @PostConstruct
    public void init(){
        System.out.println("Dog @PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog @PreDestroy");
    }
}
