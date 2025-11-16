package com.example.ecommerce.model.decorator;


import com.example.ecommerce.model.Product;


public abstract class ProductDecorator implements Product {
    protected final Product wrapped;


    protected ProductDecorator(Product wrapped){ this.wrapped = wrapped; }


    @Override
    public String getName(){ return wrapped.getName(); }


    @Override
    public String getCategory(){ return wrapped.getCategory(); }


    @Override
    public double getPrice(){ return wrapped.getPrice(); }
}