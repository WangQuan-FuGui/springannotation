package com.dream;

import com.dream.bean.Person;
import com.dream.config.MianCofig5;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class TestFactorBean {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MianCofig5.class);

    @Test
    public void test1(){
        String[] names = context.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

        //拿的是getObject方法中的对象
        Object bean = context.getBean("myFactoryBean");

        System.out.println(bean);

        //加&前缀是哪工厂bean的对象
        Object bean1 = context.getBean("&myFactoryBean");

        System.out.println(bean1);

    }

}
