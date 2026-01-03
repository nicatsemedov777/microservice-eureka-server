package com.example.serviceb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientBuilderConfiguration {

    @Bean
    public RestClient.Builder restClientBuilder(){
        return RestClient.builder();
    }
}
