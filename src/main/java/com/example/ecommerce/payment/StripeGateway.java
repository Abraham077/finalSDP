package com.example.ecommerce.payment;


public class StripeGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount, String customerReference){
        System.out.println("Processing Stripe payment for " + customerReference + " amount: " + amount);
        return true;
    }
}