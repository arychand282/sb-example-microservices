package com.bac.example.microservices.report.dto;

import lombok.Data;

/**
 * @author chandra on 25/10/2020 12:54
 */

@Data
public class PaymentReportDto {
    
    private String paymentId;
    
    private String paymentStatus;
    
}
