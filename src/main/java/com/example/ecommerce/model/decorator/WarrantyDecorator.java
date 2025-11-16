package com.example.ecommerce.model.decorator;


import com.example.ecommerce.model.Product;


public class WarrantyDecorator extends ProductDecorator {
    private final double warrantyFee;


    public WarrantyDecorator(Product wrapped, double warrantyFee){
        super(wrapped);
        this.warrantyFee = warrantyFee;
    }


    @Override
    public double getPrice(){
        return wrapped.getPrice() + warrantyFee;
    }


    @Override
    public String getName(){
        return wrapped.getName() + " + Warranty";
    }
}