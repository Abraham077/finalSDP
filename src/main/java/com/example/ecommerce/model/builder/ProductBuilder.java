package com.example.ecommerce.model.builder;


import com.example.ecommerce.model.ConcreteProduct;


public class ProductBuilder {
    private String name = "Unnamed";
    private String category = "general";
    private double basePrice = 0.0;


    public ProductBuilder withName(String name){ this.name = name; return this; }
    public ProductBuilder withCategory(String category){ this.category = category; return this; }
    public ProductBuilder withBasePrice(double price){ this.basePrice = price; return this; }


    public ConcreteProduct build(){
        return new ConcreteProduct(name, category, basePrice);
    }
}