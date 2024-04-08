package com.programmingtechie.paymentservice.dto;

import lombok.Data;

@Data
public class CreatePaymentIntentResponse {
    private String clientSecret;
}
