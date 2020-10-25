package com.bac.example.microservices.report.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chandra on 25/10/2020 13:32
 */

@Configuration
@EnableFeignClients(basePackages = {
        "com.bac.example.microservices.gateway.api"
})
@ComponentScan(basePackages = {
        "com.bac.example.microservices.report"
})
@EntityScan(basePackages = {
        "com.bac.example.microservices.report"
})
public class ReportConfig {
}
