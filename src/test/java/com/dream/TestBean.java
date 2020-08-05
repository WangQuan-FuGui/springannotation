package com.dream;

import com.dream.bean.Person;
import com.dream.config.MainCofig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    //配置文件方式
    @Test
    public void test1(){
        //获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person=(Person) context.getBean("person");

        System.out.println(person);

    }

    //配置类方式
    @Test
    public void test2(){
        ApplicationContext context= new AnnotationConfigApplicationContext(MainCofig.class);

        Person bean = context.getBean(Person.class);

        System.out.println(bean);
    }
}
