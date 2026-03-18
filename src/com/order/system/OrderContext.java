package com.order.system;

public class OrderContext {
    private OrderState state = new NewOrderState();
    private Order orderDetails;
    private PaymentStrategy payment;

    public OrderContext(Order order, PaymentStrategy payment) {
        this.orderDetails = order;
        this.payment = payment;
    }

    public void setState(OrderState state) { this.state = state; }
    public void applyPayment() { payment.pay(orderDetails.getPrice()); }
    public void nextStep() { state.next(this); }
    public void cancelOrder() { state.cancel(this); }
    
    public void showInfo() {
        System.out.println("Nội dung: " + orderDetails.getDescription());
        state.printStatus();
    }
}