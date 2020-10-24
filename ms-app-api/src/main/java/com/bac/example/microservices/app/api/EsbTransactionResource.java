package com.bac.example.microservices.app.api;

import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chandra on 24/10/2020 17:16
 */

@RequestMapping(value = "/api/v1/transaction")
public interface EsbTransactionResource {
    
    @PostMapping(value = "/balance_inquiry", consumes = MediaType.APPLICATION_JSON_VALUE)
    BalanceInquiryResponseDto balanceInquiry(@RequestBody BalanceInquiryRequestDto balanceInquiryRequestDto);
    
}
