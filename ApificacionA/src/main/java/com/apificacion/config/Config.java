package com.apificacion.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean("RestCli")
    public RestTemplate registarRestTemplate() {
        return new RestTemplate();
    }
}
