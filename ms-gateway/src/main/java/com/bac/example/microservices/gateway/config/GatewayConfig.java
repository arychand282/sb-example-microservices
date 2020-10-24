package com.bac.example.microservices.gateway.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chandra on 24/10/2020 16:33
 */

@Configuration
@ComponentScan(basePackages = {
        "com.bac.example.microservices.gateway"
})
@EntityScan(basePackages = {
        "com.bac.example.microservices.gateway"
})
public class GatewayConfig {
}
