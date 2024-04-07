package com.example.demo.component;

import com.example.demo.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {


    @Bean
    Person createPerson(){
        return new Person("a",12);
    }
}
