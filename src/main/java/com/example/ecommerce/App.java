package com.example.ecommerce;


import com.example.ecommerce.facade.ECommerceFacade;
import com.example.ecommerce.model.builder.ProductBuilder;
import com.example.ecommerce.model.ConcreteProduct;
import com.example.ecommerce.model.decorator.GiftWrapDecorator;
import com.example.ecommerce.payment.PaypalGateway;
import com.example.ecommerce.strategy.PercentageDiscountStrategy;


public class App {
    public static void main(String[] args) {
        ECommerceFacade facade = new ECommerceFacade();


        ConcreteProduct laptop = new ProductBuilder()
                .withName("Laptop Pro")
                .withBasePrice(1500.0)
                .withCategory("Electronics")
                .build();


        var wrappedLaptop = new GiftWrapDecorator(laptop, 5.0);


        facade.setDiscountStrategy(new PercentageDiscountStrategy(10)); // 10% discount


        facade.addProductToCart(wrappedLaptop, 1);


        facade.setPaymentGateway(new PaypalGateway());
        boolean paid = facade.checkout("customer@example.com");


        System.out.println("Payment success: " + paid);
    }
}