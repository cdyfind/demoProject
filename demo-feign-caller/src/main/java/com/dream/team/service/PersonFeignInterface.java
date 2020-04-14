package com.dream.team.service;

import com.dream.team.model.Person;
import com.dream.team.service.impl.PersonFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "feignProvider",fallback = PersonFallbackService.class)
public interface PersonFeignInterface {

    @RequestMapping("/person/test")
    public Object test();

    @RequestMapping("/person/setData")
    public void setData(@RequestBody Person person);

}
