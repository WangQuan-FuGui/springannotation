package com.dream.config.importSelector;

import com.dream.config.importEntity.Blue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param annotationMetadata 当前类的注解信息
     * @param beanDefinitionRegistry 定义的注册类
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //当前容器中是否有这个Bean信息
        boolean blue = beanDefinitionRegistry.containsBeanDefinition("blue");
        //自定义注册Bean
        if(!blue)beanDefinitionRegistry.registerBeanDefinition("blue",//bean的ID
                new RootBeanDefinition(Blue.class));//bean的信息,类型，scope等..
    }
}
