package com.bac.example.microservices.gateway.web.rest;

import com.bac.example.microservices.gateway.api.IntegrationEsbTransactionResource;
import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import com.bac.example.microservices.gateway.service.IntegrationEsbTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandra on 24/10/2020 16:38
 */

@RestController
public class IntegrationEsbTransactionController implements IntegrationEsbTransactionResource {
    
    @Autowired
    private IntegrationEsbTransactionService integrationEsbTransactionService;
    
    @Override
    public BalanceInquiryResponseDto balanceInquiry(@RequestBody BalanceInquiryRequestDto balanceInquiryRequestDto) {
        return integrationEsbTransactionService.balanceInquiry(balanceInquiryRequestDto);
    }
}
