package com.example.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class Main {
    @Value("${internal.foo:undefined}")
    private String internalFoo;
    @Value("${external.foo:undefined}")
    private String externalFoo;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @PostConstruct
    public void inspect() {
        log.debug("internal : {}", internalFoo);
        log.debug("external : {}", externalFoo);
    }
}
