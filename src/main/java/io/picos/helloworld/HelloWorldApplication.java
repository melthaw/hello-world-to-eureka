package io.picos.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class HelloWorldApplication {

    @Configuration
    @EnableEurekaClient
    @Profile({"production", "development"})
    public class EurekaConfigurer {

    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
