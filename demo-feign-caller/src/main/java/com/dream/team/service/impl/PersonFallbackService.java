package com.dream.team.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dream.team.model.Person;
import com.dream.team.service.PersonFeignInterface;
import org.springframework.stereotype.Service;

@Service
public class PersonFallbackService implements PersonFeignInterface {

    @Override
    public Object test() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errorInfo","基础调用报错");
        return jsonObject;
    }

    @Override
    public void setData(Person person) {

    }
}
