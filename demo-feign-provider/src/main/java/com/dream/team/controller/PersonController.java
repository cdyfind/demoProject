package com.dream.team.controller;

import com.alibaba.fastjson.JSONObject;
import com.dream.team.model.Person;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/person")
public class PersonController {
    /**
     *返回json类型的数据接收端可以用object类型接收
     */

    @RequestMapping("/test")
    public Object test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("value","test");
        return jsonObject;
    }

    @RequestMapping("/setData")
    private void setData(@RequestBody Person person){
        Person person1 = new Person();
        person1.setAge(person.getAge());
        person1.setName(person.getName());
        log.info("年龄为:"+person1.getAge());
        log.info("名字为:"+person1.getName());
    }
}
