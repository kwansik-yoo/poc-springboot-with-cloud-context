package com.example.lib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Configuration
@ComponentScan("com.example.lib")
public class Config {

    @Bean("fooClient")
    public WebClient fooClient() {
        log.debug("fooClient is registered......");
        return WebClient.create("/foo");
    }
}
