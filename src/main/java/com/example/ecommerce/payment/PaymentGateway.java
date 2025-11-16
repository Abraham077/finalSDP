package com.example.ecommerce.payment;


public interface PaymentGateway {
    boolean pay(double amount, String customerReference);
}