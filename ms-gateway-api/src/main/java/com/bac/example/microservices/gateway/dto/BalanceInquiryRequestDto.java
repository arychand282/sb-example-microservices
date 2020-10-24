package com.bac.example.microservices.gateway.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author chandra on 24/10/2020 16:24
 */

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BalanceInquiryRequestDto extends DefaultEsbRequestDto {
    
    @NotNull
    @NotEmpty
    private String accountNo;
    
}
