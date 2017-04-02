package com.example.controller;

import com.example.modal.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsj on 2017/3/19.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/demo")
public class DemoApplication {

    @Value("${myname}")  //从配置文件里读取变量
    private String myname;


    @Autowired
    private Person person;

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String demo(){
        return myname ;
    }

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public String getPerson(){
        return person.toString() ;
    }
}
