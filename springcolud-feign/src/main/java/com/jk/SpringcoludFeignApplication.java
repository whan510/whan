package com.jk;

import com.jk.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcoludFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoludFeignApplication.class, args);
    }

}
