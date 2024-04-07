package com.example.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Mail {

    @Autowired
    List<Validator> validators;

    public void validator(String  mail){
        for (Validator validator : validators) {
            validator.validate(mail);
        }
        //...
    }
}
