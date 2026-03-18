package com.payment.system;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo số tiền gốc và áp dụng Decorator (Phí + Giảm giá)
        PaymentAmount finalPrice = new DiscountDecorator(
                                    new ProcessingFeeDecorator(
                                        new BaseAmount(100.0)));

        // 2. Chọn phương thức thanh toán (Strategy)
        PaymentMethod myPaypal = new PayPalPayment();

        // 3. Khởi tạo quy trình (Context)
        TransactionContext transaction = new TransactionContext(finalPrice, myPaypal);

        // Chạy qua các trạng thái (State)
        transaction.process(); // Chờ -> Xử lý
        transaction.process(); // Xử lý -> Thành công
        transaction.process(); // Đã thành công
    }
}