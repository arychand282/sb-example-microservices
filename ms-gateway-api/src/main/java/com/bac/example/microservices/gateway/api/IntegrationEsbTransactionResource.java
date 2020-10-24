package com.bac.example.microservices.gateway.api;

import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chandra on 24/10/2020 16:14
 */

@FeignClient(name = "gateway")
@RequestMapping(value = "/api/v1/esb/transaction")
public interface IntegrationEsbTransactionResource {
    
    @PostMapping(value = "/balance_inquiry", consumes = MediaType.APPLICATION_JSON_VALUE)
    BalanceInquiryResponseDto balanceInquiry(@RequestBody BalanceInquiryRequestDto balanceInquiryRequestDto);
    
}
