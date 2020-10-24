package com.bac.example.microservices.gateway.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author chandra on 24/10/2020 16:23
 */

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BalanceInquiryResponseDto extends DefaultEsbResponseDto {
    
    @NotNull
    @NotEmpty
    private String balance;
    
    private String accountNo;

    private String systemTraceNumber;

    private String retrievalReferenceNumber;
    
}
