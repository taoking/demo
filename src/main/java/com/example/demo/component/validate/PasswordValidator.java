package com.example.demo.component.validate;

import com.example.demo.component.Validator;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class PasswordValidator implements Validator {
    @Override
    public void validate(String target) {
        if (target == null || target.length() < 6){
            throw  new IllegalArgumentException("密码长度不能少于6位");
        }
    }
}
