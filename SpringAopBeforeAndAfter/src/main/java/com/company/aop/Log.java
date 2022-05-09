package com.company.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

    @Before("pointCutSaveProduct()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("|" + joinPoint.toString() + "|");
        System.out.println("|" + joinPoint.getKind() + "|");
        System.out.println("----------------");
        System.out.println("Session is begin!");
        System.out.println("Transaction is begin!");
        System.out.println("****************");
    }

    @After("pointCutSaveProduct()")
    public void afterAdvice(){
        System.out.println("****************");
        System.out.println("Session is over");
        System.out.println("Transaction is over");
        System.out.println("----------------");
    }


    @Pointcut("within(com.company.repository.ProductRepository)")
    public void pointCutSaveProduct(){}
}
