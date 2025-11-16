package com.example.ecommerce.model.decorator;


import com.example.ecommerce.model.Product;


public class GiftWrapDecorator extends ProductDecorator {
    private final double wrapPrice;


    public GiftWrapDecorator(Product wrapped, double wrapPrice){
        super(wrapped);
        this.wrapPrice = wrapPrice;
    }


    @Override
    public double getPrice(){
        return wrapped.getPrice() + wrapPrice;
    }


    @Override
    public String getName(){
        return wrapped.getName() + " + GiftWrap";
    }
}