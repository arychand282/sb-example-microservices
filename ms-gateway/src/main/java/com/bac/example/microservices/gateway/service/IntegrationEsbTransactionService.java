package com.bac.example.microservices.gateway.service;

import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;

/**
 * @author chandra on 24/10/2020 16:39
 */

public interface IntegrationEsbTransactionService {
    
    BalanceInquiryResponseDto balanceInquiry(BalanceInquiryRequestDto balanceInquiryRequestDto);
    
}
