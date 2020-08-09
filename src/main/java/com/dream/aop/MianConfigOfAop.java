package com.dream.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP{动态代理}
 *      指在程序运行期间动态的将某段代码切入到指定位置进行的编程方式.
 *
 *  1.导入aop模块；spring AOP :(spring-aspects)
 *  2,定义一个业务处理类(MathCalculator);在业务逻辑运行的时候将日志打印
 *  3.定义一个日志切面类，动态感知MathCalculator
 *      通知方法:
 *          前置通知(@Before)
 *          后置通知(@After)
 *          返回通知(@AfterReturning)
 *          异常通知(@AfterThrowi)
 *          环绕通知(@Around)
 *   4.给切面类的目标方法标识合适运行
 *
 *   5.将切面和业务逻辑类（目标方法所在类)都加入到容器中；
 *
 *   6.必须告诉spring那个类是切面类（给切面类上加一个注解：@Aspect）
 *
 *   7.@EnableAspectJAutoProxy开启注解的aop
 */
@EnableAspectJAutoProxy
@Configuration
public class MianConfigOfAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
