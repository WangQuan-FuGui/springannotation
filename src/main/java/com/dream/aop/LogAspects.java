package com.dream.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Aspect告诉spring这是一个切面类.
 */
@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1.本类引用
    @Pointcut("execution(public int com.dream.aop.MathCalculator.*(..))")
    public void poinCut(){

    }
    @Before("poinCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+";logStart........");
    }
    @After("poinCut()")
    public void logEnd(){
        System.out.println("logEnd........");
    }
    @AfterThrowing(value = "poinCut()",throwing = "excpetion")
    public void logExcption(Exception excpetion){
        System.out.println("logExcption........");
    }
    //JoinPoint joinPoint一定要放在参数的第一位
    @AfterReturning(value = "poinCut()",returning = "res")
    public void logReturn(Object res){
        System.out.println(res+";logReturn........");
    }
}
