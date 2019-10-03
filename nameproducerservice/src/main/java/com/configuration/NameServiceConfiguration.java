package com.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class NameServiceConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(NameServiceConfiguration.class);
    }
}
