package com.bac.example.microservices.app.service;

import com.bac.example.microservices.gateway.dto.BalanceInquiryRequestDto;
import com.bac.example.microservices.gateway.dto.BalanceInquiryResponseDto;

/**
 * @author chandra on 24/10/2020 17:20
 */

public interface EsbTransactionService {
    
    BalanceInquiryResponseDto balanceInquiry(BalanceInquiryRequestDto balanceInquiryRequestDto);
    
}
