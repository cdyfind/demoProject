package com.dream.team.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MuyiAspectImpl {

    @Pointcut("@annotation(com.dream.team.aop.Muyi)")
    private  void cut(){
    }

//    @Around("cut()")
//    public void around(){
//        System.out.println("1");
//    }

    @Before("cut()")
    public void before(){
        System.out.println("muyi begin");
    }

    @After("cut()")
    public void after(){
        System.out.println("muyi end");
    }
}

