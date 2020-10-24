package com.bac.example.microservices.app.web.rest;

import com.bac.example.microservices.app.api.EsbTransactionResource;
import com.bac.example.microservices.app.service.EsbTransactionService;
import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chandra on 24/10/2020 17:19
 */

@RestController
public class EsbTransactionController implements EsbTransactionResource {
    
    @Autowired
    private EsbTransactionService esbTransactionService;
    
    @Override
    public BalanceInquiryResponseDto balanceInquiry(@RequestBody BalanceInquiryRequestDto balanceInquiryRequestDto) {
        return esbTransactionService.balanceInquiry(balanceInquiryRequestDto);
    }
}
