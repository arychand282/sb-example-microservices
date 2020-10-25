package com.bac.example.microservices.report.service.impl;

import com.bac.example.microservices.gateway.api.IntegrationEsbTransactionResource;
import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import com.bac.example.microservices.report.service.PaymentReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author chandra on 25/10/2020 12:59
 */

@Slf4j
@Service
public class PaymentReportServiceImpl implements PaymentReportService {
    
    @Autowired
    private IntegrationEsbTransactionResource integrationEsbTransactionResource;
    
    @Override
    public String generate(String paymentId) {
        log.info("[-]: request: " + paymentId);
        log.info("[-]: This Service should return Multipart File such as pdf or csv!");
        log.info("[-]: But currently return DTO instead for testing only.");
        /*
        TODO: You need a report generator to generate new report with format such as pdf or csv!
         */
        
        log.info("[-]: Get Data from GATEWAY instance");
        int stn = 10000000 + new Random().nextInt(100000000);
        int ssn = 10000000 + new Random().nextInt(100000000);
        BalanceInquiryRequestDto balanceInquiryRequestDto = new BalanceInquiryRequestDto();
        balanceInquiryRequestDto.setSystemTraceNumber("STN-" + Integer.toString(stn));
        balanceInquiryRequestDto.setRetrievalReferenceNumber("SSN-" + Integer.toString(ssn));
        BalanceInquiryResponseDto response = integrationEsbTransactionResource.balanceInquiry(balanceInquiryRequestDto);
        log.info("[GATEWAY-RESPONSE]: " + response);
        
        return response.getResponseCode() + " - " + response.getResponseMessage();
    }
}
