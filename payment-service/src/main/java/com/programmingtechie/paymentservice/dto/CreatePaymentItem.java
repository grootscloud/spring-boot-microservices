package com.programmingtechie.paymentservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreatePaymentItem {
    private String id;
    private double price;
}
