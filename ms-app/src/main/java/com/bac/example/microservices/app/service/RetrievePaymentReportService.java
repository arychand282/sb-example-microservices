package com.bac.example.microservices.app.service;

import com.bac.example.microservices.report.dto.PaymentReportDto;

/**
 * @author chandra on 25/10/2020 13:26
 */

public interface RetrievePaymentReportService {
    
    PaymentReportDto makeRequest(PaymentReportDto paymentReportDto);
    
}
