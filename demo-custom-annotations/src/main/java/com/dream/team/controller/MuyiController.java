package com.dream.team.controller;

import com.dream.team.aop.Muyi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/muyi")
public class MuyiController {

    @Muyi
    @RequestMapping(value = "/demo")
    public void demo(){
//        System.out.println("3");
    }
}
