package com.bac.example.microservices.app.service.impl;

import com.bac.example.microservices.app.service.EsbTransactionService;
import com.bac.example.microservices.gateway.api.IntegrationEsbTransactionResource;
import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author chandra on 24/10/2020 17:20
 */

@Slf4j
@Service
public class EsbTransactionServiceImpl implements EsbTransactionService {
    
    @Autowired
    private IntegrationEsbTransactionResource integrationEsbTransactionResource;
    
    @Override
    public BalanceInquiryResponseDto balanceInquiry(BalanceInquiryRequestDto balanceInquiryRequestDto) {
        try {
            int stn = 10000000 + new Random().nextInt(100000000);
            int ssn = 10000000 + new Random().nextInt(100000000);
            balanceInquiryRequestDto.setSystemTraceNumber("STN-" + Integer.toString(stn));
            balanceInquiryRequestDto.setRetrievalReferenceNumber("SSN-" + Integer.toString(ssn));
            BalanceInquiryResponseDto response = integrationEsbTransactionResource.balanceInquiry(balanceInquiryRequestDto);
            log.info("[GATEWAY-RESPONSE]: " + response);
            return response;
        } catch (Exception e) {
            log.error("Exception: ", e);
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }
}
