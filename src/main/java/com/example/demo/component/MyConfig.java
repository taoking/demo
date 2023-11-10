package com.example.demo.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="tao")
@Component
@Data
public class MyConfig {
    private String id;

    private String username;

    private String type="1";
}
