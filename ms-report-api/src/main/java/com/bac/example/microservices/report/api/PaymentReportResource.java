package com.bac.example.microservices.report.api;

import com.bac.example.microservices.report.dto.PaymentReportDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chandra on 25/10/2020 12:52
 */

@FeignClient(name = "report")
@RequestMapping(value = "/api/v1/report/payment")
public interface PaymentReportResource {
    
    @PostMapping(value = "/generate", consumes = MediaType.APPLICATION_JSON_VALUE)
    PaymentReportDto generate(@RequestBody PaymentReportDto paymentReportDto);
    
}
