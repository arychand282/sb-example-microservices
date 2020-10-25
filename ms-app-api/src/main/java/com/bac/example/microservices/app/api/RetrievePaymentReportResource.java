package com.bac.example.microservices.app.api;

import com.bac.example.microservices.report.dto.PaymentReportDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chandra on 25/10/2020 13:07
 */

@RequestMapping(value = "/api/v1/app/retrieve_payment_report")
public interface RetrievePaymentReportResource {
    
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    PaymentReportDto makeRequest(@RequestBody PaymentReportDto paymentReportDto);
    
}
