package com.dream.config;

import com.dream.bean.Num;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.inject.Inject;

@Configuration
@ComponentScan(value = {"com.dream.bean"})
public class MianConfig8 {
    /**
     * 第一种方式:
     * @Autowired自动装配
     * 表示在属性上:
     *  默认context.getBean(Person.class);
     *  按照类型查找，如果找到多个，就会以他的引用名字当id查找
     *  Person p(id=p);
     *  或者@Qualifier("id")来指明id指定装配
     *  默认一定要将属性赋值，如果容器中没有的这个类型的属性时会报错.
     *  @Autowired(required=fals)不必须赋值
     *  @Primary,默认使用首选的bean
     *表示在方法上:
     * 会在创建对象的时候调用方法并且对方法的参数自动赋值
     *
     * 表示在构造器上:
     *  默认加载到IOC容器中的组件，回调用bean的无参构造器，创建实例，放到构造器后会调用
     * @Autowired标识的
     *
     */

    /**
     * 第二种方式（java规范JSR250）
     *  @Resource 实现自动装配功能
     *  默认使用组件名字装配可以用注解的name指定
     *  不支持@Primary,和required
     */

    /**
     * 第三种方式@Inject java规范JSR330）需要导依赖
     * 和Autowired一样，但是inject没equired=fals属性
     */

}
