package com.example.ecommerce.strategy;


public class PercentageDiscountStrategy implements DiscountStrategy {
    private final double percent;


    public PercentageDiscountStrategy(double percent) { this.percent = percent; }


    @Override
    public double applyDiscount(double total) {
        return total * (1 - percent / 100.0);
    }
}