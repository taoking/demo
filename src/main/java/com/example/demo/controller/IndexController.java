package com.example.demo.controller;

import com.example.demo.component.MyConfig;
import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class IndexController{

    @Autowired
    private Environment env;

    @Value("${server.port}")
    private String port;

    @Autowired
    private MyConfig config;

    @Autowired
    private Person  person;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        System.out.println("hello");
        saveLog();
        return port + "hello" + env.getProperty("server.port") + "test" + config.getId() + config.getUsername() + config.getType();

    }

    @Async
    public void saveLog() {
        System.err.println(Thread.currentThread().getName());
    }


//    @Bean
//    public RestTemplate getRestTemplate(){
//        System.out.println("create resttemplate");
//        return new RestTemplate();
//    }

    private void PersonStream(List<Person> personList){
        personList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
    }

}
