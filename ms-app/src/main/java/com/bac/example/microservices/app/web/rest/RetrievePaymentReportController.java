package com.bac.example.microservices.app.web.rest;

import com.bac.example.microservices.app.api.RetrievePaymentReportResource;
import com.bac.example.microservices.app.service.RetrievePaymentReportService;
import com.bac.example.microservices.report.dto.PaymentReportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandra on 25/10/2020 13:25
 */

@RestController
public class RetrievePaymentReportController implements RetrievePaymentReportResource {
    
    @Autowired
    private RetrievePaymentReportService retrievePaymentReportService;
    
    @Override
    public PaymentReportDto makeRequest(@RequestBody PaymentReportDto paymentReportDto) {
        return retrievePaymentReportService.makeRequest(paymentReportDto);
    }
}
