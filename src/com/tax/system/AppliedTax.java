package com.tax.system;

public class AppliedTax extends TaxDecorator {
    public AppliedTax(Product p, TaxStrategy s) {
        super(p, s);
    }

    @Override
    public double getTotalTax() {
        // Cộng thuế hiện tại vào tổng các loại thuế trước đó
        return product.getTotalTax() + strategy.calculate(product.getBasePrice());
    }
}