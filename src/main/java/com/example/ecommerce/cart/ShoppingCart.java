package com.example.ecommerce.cart;


import com.example.ecommerce.model.Product;


import java.util.LinkedHashMap;
import java.util.Map;


public class ShoppingCart {
    private final Map<Product, Integer> items = new LinkedHashMap<>();


    public void addItem(Product p, int qty){
        items.merge(p, qty, Integer::sum);
    }


    public void removeItem(Product p){
        items.remove(p);
    }


    public double calculateTotal(){
        return items.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        items.forEach((p, q) -> sb.append(p.getName()).append(" x").append(q).append(" = ").append(p.getPrice()*q).append("\n"));
        sb.append("Total: ").append(calculateTotal());
        return sb.toString();
    }
}