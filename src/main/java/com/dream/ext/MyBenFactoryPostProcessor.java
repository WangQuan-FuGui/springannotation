package com.dream.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *是在bean构建实例之前调用的
 */
@Component
public class MyBenFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        int beanDefinitionCount = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("beanDefinitionCount=="+beanDefinitionCount);
        System.out.println("beanDefinitionNames=="+ Arrays.toString(beanDefinitionNames));
    }
}
