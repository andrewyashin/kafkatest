package com.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableConfigurationProperties
public class NameConsumerConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(NameConsumerConfiguration.class);
    }
}
