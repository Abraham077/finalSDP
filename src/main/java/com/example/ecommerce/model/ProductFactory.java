package com.example.ecommerce.model;


public class ProductFactory {
    public static Product create(String type, String name, double price){
        switch (type.toLowerCase()){
            case "electronics":
            case "clothing":
            case "food":
                return new ConcreteProduct(name, type, price);
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}