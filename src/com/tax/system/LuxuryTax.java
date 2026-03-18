package com.tax.system;

public class LuxuryTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.2; // Thuế hàng xa xỉ 20%
    }
}