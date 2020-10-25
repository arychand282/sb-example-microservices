package com.bac.example.microservices.report.web.rest;

import com.bac.example.microservices.report.api.PaymentReportResource;
import com.bac.example.microservices.report.dto.PaymentReportDto;
import com.bac.example.microservices.report.service.PaymentReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandra on 25/10/2020 13:01
 */

@RestController
public class PaymentReportController implements PaymentReportResource {
    
    @Autowired
    private PaymentReportService paymentReportService;
    
    @Override
    public PaymentReportDto generate(@RequestBody PaymentReportDto paymentReportDto) {
        paymentReportDto.setPaymentStatus(paymentReportService.generate(paymentReportDto.getPaymentId()));
        return paymentReportDto;
    }
}
