package com.pblgllgs.sb3batchreaffiledb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Sb3BatchReafFileDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3BatchReafFileDbApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
