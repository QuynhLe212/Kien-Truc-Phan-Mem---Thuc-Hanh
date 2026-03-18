package com.tax.system;

public class VATTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.1; // Thuế VAT 10%
    }
}