package com.bac.example.microservices.gateway.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author chandra on 24/10/2020 16:18
 */

@Data
public class DefaultEsbResponseDto {
    
    @NotNull
    @NotEmpty
    private String responseCode;
    
    @NotNull
    @NotEmpty
    private String responseMessage;
    
}
