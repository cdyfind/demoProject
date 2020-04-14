package com.dream.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cdy
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomAnnotationsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomAnnotationsApplication.class, args);
    }
}
