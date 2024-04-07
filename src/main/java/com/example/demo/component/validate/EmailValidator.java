package com.example.demo.component.validate;

import com.example.demo.component.Validator;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class EmailValidator implements Validator {
    @Override
    public void validate(String target) {
        if (target.isEmpty()){
            throw  new IllegalArgumentException("Email不能为空");
        }
    }
}
