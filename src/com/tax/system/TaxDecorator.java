package com.tax.system;

public abstract class TaxDecorator implements Product {
    protected Product product;
    protected TaxStrategy strategy;

    public TaxDecorator(Product p, TaxStrategy s) {
        this.product = p;
        this.strategy = s;
    }

    @Override public String getName() { return product.getName(); }
    @Override public double getBasePrice() { return product.getBasePrice(); }
}