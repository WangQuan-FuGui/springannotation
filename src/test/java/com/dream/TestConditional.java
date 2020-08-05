package com.dream;

import com.dream.bean.Person;
import com.dream.config.MainCofig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class TestConditional {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainCofig3.class);

    @Test
    public void test1() {
        String[] names = context.getBeanDefinitionNames();

        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test2() {
        //获取当前容器的环境
        ConfigurableEnvironment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");

        System.out.println(osName);
    }
}
