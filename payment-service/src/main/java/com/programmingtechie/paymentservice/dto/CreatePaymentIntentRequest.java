package com.programmingtechie.paymentservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreatePaymentIntentRequest {
    private List<CreatePaymentItem> items;
}
