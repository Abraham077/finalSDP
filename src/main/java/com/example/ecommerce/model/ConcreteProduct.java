package com.example.ecommerce.model;


import java.util.Objects;


public class ConcreteProduct implements Product {
    private final String name;
    private final String category;
    private final double price;


    public ConcreteProduct(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }


    @Override
    public String getName() { return name; }


    @Override
    public String getCategory() { return category; }


    @Override
    public double getPrice() { return price; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcreteProduct that = (ConcreteProduct) o;
        return Double.compare(that.price, price) == 0 && name.equals(that.name) && category.equals(that.category);
    }


    @Override
    public int hashCode() { return Objects.hash(name, category, price); }
}