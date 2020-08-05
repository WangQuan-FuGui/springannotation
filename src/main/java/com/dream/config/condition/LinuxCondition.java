package com.dream.config.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//判断是否是Linux系统
public class LinuxCondition implements Condition{

    /**
     *
     * @param conditionContext 判断条件能使用的上下文（环境）
     * @param annotatedTypeMetadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取到IOC当前使用的Bean工场
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //获取到bean定义类的注册
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        //判断当前容器中是否有bill这个bean
        boolean person = registry.containsBeanDefinition("bill");

        String osName = environment.getProperty("os.name");
        if (osName.contains("Linux")||person)return true;
        return false;
    }
}
