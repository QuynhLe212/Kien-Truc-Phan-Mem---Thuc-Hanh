package com.payment.system;

public class ProcessingFeeDecorator implements PaymentAmount {
    private PaymentAmount paymentAmount;
    private double fee = 2.0; // Phí cố định

    public ProcessingFeeDecorator(PaymentAmount pa) { this.paymentAmount = pa; }
    @Override public double getAmount() { return paymentAmount.getAmount() + fee; }
    @Override public String getDescription() { 
        return paymentAmount.getDescription() + " + Phí xử lý (2.0)"; 
    }
}