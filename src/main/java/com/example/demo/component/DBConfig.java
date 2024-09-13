package com.example.demo.component;

import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@PropertySource("db.properties")
public class DBConfig {

    @Value("${db.user}")
    String  user;

    @Value("${db.password}")
    String  password;

    @Value("${db.url}")
    String  url;


    @Bean
    DataSource CreateDataSource() {

    }
}
