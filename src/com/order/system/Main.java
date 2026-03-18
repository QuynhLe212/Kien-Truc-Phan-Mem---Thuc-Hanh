package com.order.system;

public class Main {
    public static void main(String[] args) {
        // Thiết lập đơn hàng có gói quà
        Order order = new GiftWrapDecorator(new BasicOrder());
        
        // Khởi tạo context với thanh toán bằng thẻ
        OrderContext context = new OrderContext(order, new CreditCardPayment());

        // Mô phỏng quy trình
        context.showInfo();
        context.applyPayment();
        
        System.out.println("--- Chuyển trạng thái ---");
        context.nextStep();
        context.showInfo();
        
        System.out.println("--- Hoàn tất ---");
        context.nextStep();
        context.showInfo();
    }
}