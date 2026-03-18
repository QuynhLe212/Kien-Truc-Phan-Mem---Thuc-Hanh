package com.payment.system;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Đang xử lý thanh toán " + amount + " qua Thẻ tín dụng...");
    }
}