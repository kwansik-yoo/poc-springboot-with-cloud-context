package com.example.lib;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Foo {
    @Autowired
    @Qualifier("fooClient")
    private WebClient fooClient;

    @PostConstruct
    public void inspect() {
        log.debug("Foo is registered....... with fooClient : {}", fooClient.toString());
    }
}