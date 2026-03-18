package com.payment.system;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Đang kết nối cổng PayPal để thanh toán " + amount + "...");
    }
}