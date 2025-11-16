package com.example.ecommerce.strategy;


public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double total){ return total; }
}