package com.tax.system;

public class SimpleProduct implements Product {
    private String name;
    private double price;

    public SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override public double getBasePrice() { return price; }
    @Override public double getTotalTax() { return 0; }
    @Override public String getName() { return name; }
}