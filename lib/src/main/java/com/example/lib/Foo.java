package com.example.lib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Foo {
    @PostConstruct
    public void inspect() {
        log.debug("Foo is registered.......");
    }
}