package com.king.s.cloud.e.client.a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogP {

    public LogP(){
        System.out.println("=====LogP()====");
    }

    @Pointcut("@annotation(com.king.s.cloud.e.client.a.annotation.LogPrinter)")
    public void logPA(){}

    @Before("logPA()")
    public Object llog(JoinPoint jp){
        jp.getKind();
        System.out.println("===============");
        return "aad";
    }
}
