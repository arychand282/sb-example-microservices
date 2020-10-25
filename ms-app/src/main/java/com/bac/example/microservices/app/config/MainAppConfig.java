package com.bac.example.microservices.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author chandra on 24/10/2020 13:07
 */

@Configuration
@EnableFeignClients(basePackages = {
        "com.bac.example.microservices.gateway.api",
        "com.bac.example.microservices.report.api"
})
@ComponentScan(basePackages = {
        "com.bac.example.microservices.app"
})
@EnableJpaRepositories(basePackages = {
        "com.bac.example.microservices.app"
})
@EntityScan(basePackages = {
        "com.bac.example.microservices.app"
})
public class MainAppConfig {
}
