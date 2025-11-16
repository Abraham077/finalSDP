package com.example.ecommerce.payment;


public abstract class Payment {
    protected final PaymentGateway gateway;


    protected Payment(PaymentGateway gateway){ this.gateway = gateway; }


    public abstract boolean execute(double amount, String customerId);
}