package com.bac.example.microservices.app.service.impl;

import com.bac.example.microservices.app.service.RetrievePaymentReportService;
import com.bac.example.microservices.report.api.PaymentReportResource;
import com.bac.example.microservices.report.dto.PaymentReportDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chandra on 25/10/2020 13:31
 */

@Slf4j
@Service
public class RetrievePaymentReportServiceImpl implements RetrievePaymentReportService {
    
    @Autowired
    private PaymentReportResource paymentReportResource;
    
    @Override
    public PaymentReportDto makeRequest(PaymentReportDto paymentReportDto) {
        PaymentReportDto response = paymentReportResource.generate(paymentReportDto);
        log.info("[REPORT-RESPONSE]: " + response);
        return response;
    }
}
