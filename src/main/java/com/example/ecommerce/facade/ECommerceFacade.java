package com.example.ecommerce.facade;


import com.example.ecommerce.cart.ShoppingCart;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.payment.PaymentGateway;
import com.example.ecommerce.strategy.DiscountStrategy;


public class ECommerceFacade {
    private final ShoppingCart cart = new ShoppingCart();
    private DiscountStrategy discountStrategy = null;
    private PaymentGateway paymentGateway = null;


    public void addProductToCart(Product p, int qty){
        cart.addItem(p, qty);
    }


    public void removeProductFromCart(Product p){
        cart.removeItem(p);
    }


    public void setDiscountStrategy(DiscountStrategy strategy){
        this.discountStrategy = strategy;
    }


    public void setPaymentGateway(PaymentGateway gateway){
        this.paymentGateway = gateway;
    }


    public double calculateTotal(){
        double total = cart.calculateTotal();
        if (discountStrategy != null) {
            total = discountStrategy.applyDiscount(total);
        }
        return total;
    }


    public boolean checkout(String customerId){
        double amount = calculateTotal();
        if (paymentGateway == null) throw new IllegalStateException("Payment gateway not configured");
        return paymentGateway.pay(amount, customerId);
    }
}