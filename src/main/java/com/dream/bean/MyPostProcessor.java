package com.dream.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor 这个接口实现的类会让spring调用他的实现方法
 */
public class MyPostProcessor implements BeanPostProcessor {

    /**
     * bean 初始化之前执行
     * @param o bean的实例
     * @param s bean在容器中的id
     * @return  当前容器中的实例
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization...o="+o+";s="+s);
        return o;
    }

    /**
     * bean 初始化之后执行
     * @param o
     * @param s
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        System.out.println("postProcessAfterInitialization...o="+o+";s="+s);
        return o;
    }
}
