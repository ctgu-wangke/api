package org.wangke.api.test.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

   @RequestMapping(value = "/hello")
    public String hello(){
       String ls = "12";

        return "hello"+ ls;
    }
}
