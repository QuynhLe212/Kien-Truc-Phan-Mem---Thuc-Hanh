package com.payment.system;

// Quan trọng nhất là phải có: implements PaymentAmount
public class BaseAmount implements PaymentAmount { 
    private double price;

    public BaseAmount(double price) {
        this.price = price;
    }

    @Override
    public double getAmount() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Số tiền gốc";
    }
}