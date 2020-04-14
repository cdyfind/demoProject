package com.dream.team.controller;

import com.dream.team.model.Person;
import com.dream.team.service.PersonFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonFeignController {

    @Autowired
    private PersonFeignInterface personFeignInterface;

    @RequestMapping("/test")
    public Object test(){
       return personFeignInterface.test();
    }

    @RequestMapping("/setData")
    public void setData(Person person){
        personFeignInterface.setData(person);
    }
}
