package com.payment.system;

public class DiscountDecorator implements PaymentAmount {
    private PaymentAmount paymentAmount;
    private double discountRate = 0.1; // Giảm 10%

    public DiscountDecorator(PaymentAmount pa) { this.paymentAmount = pa; }
    @Override public double getAmount() { 
        return paymentAmount.getAmount() * (1 - discountRate); 
    }
    @Override public String getDescription() { 
        return paymentAmount.getDescription() + " - Mã giảm giá (10%)"; 
    }
}