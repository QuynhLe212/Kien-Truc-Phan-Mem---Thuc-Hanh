package com.tax.system;

public interface ProductState {
    void processTax(ProductContext context);
    String getStatusName();
}