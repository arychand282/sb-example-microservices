package com.bac.example.microservices.gateway.service.impl;

import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import com.bac.example.microservices.gateway.service.IntegrationEsbTransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chandra on 24/10/2020 16:40
 */

@Slf4j
@Service
public class IntegrationEsbTransactionServiceImpl implements IntegrationEsbTransactionService {
    @Override
    public BalanceInquiryResponseDto balanceInquiry(BalanceInquiryRequestDto balanceInquiryRequestDto) {
        
        log.info("[-]: request: " + balanceInquiryRequestDto);
        
        /*
        TODO: You need manually adding method to communicate with ESB server.
        here only an example response. 
         */
        log.info("[-]: You need manually adding method to communicate with ESB server.");
        log.info("[-]: here only an example response.");
        
        double mockBalance = ((Math.random() * 1000) * 10000);
        
        BalanceInquiryResponseDto response = new BalanceInquiryResponseDto();
        response.setResponseCode("00");
        response.setResponseMessage("Success");
        response.setAccountNo(balanceInquiryRequestDto.getAccountNo());
        response.setBalance("Rp. " + String.format("%,.2f", mockBalance));
        response.setRetrievalReferenceNumber(balanceInquiryRequestDto.getRetrievalReferenceNumber());
        response.setSystemTraceNumber(balanceInquiryRequestDto.getSystemTraceNumber());
        log.info("[ESB-RESPONSE]: " + response);
        
        return response;
    }
}
