package com.king.s.cloud.e.client.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestA {

    public TestA(){
        System.out.println("=====TestA()=====");
    }

    @Pointcut(value = "execution(* com.king.s.cloud.e.client.a.controller.*.*(..))")
    public void logp2(){}

    @Before("logp2()")
    public Object logP(JoinPoint pjp){
        System.out.println("=====-------------===");
        pjp.getKind();
        return "sdf";
    }
}
