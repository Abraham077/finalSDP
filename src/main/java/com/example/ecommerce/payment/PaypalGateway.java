package com.example.ecommerce.payment;


public class PaypalGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount, String customerReference){
        System.out.println("Processing PayPal payment for " + customerReference + " amount: " + amount);

        return true;
    }
}