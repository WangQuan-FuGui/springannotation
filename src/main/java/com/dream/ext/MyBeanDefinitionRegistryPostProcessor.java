package com.dream.ext;

import com.dream.config.importEntity.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor执行时机优先于BeanFactoryPostProcessor
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /**
     * BeanDefinitionRegistry,BeanFactoty的bean定义信息都从这个对象中拿
     * @param beanDefinitionRegistry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

        beanDefinitionRegistry.registerBeanDefinition("hello",new RootBeanDefinition(Blue.class));

        System.out.println("postProcessBeanDefinitionRegistry....");

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory bean的定义数量为="+configurableListableBeanFactory.getBeanDefinitionCount());
    }
}
