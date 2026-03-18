package com.order.system;

public class ProcessingState implements OrderState {
    public void next(OrderContext context) { context.setState(new DeliveredState()); }
    public void cancel(OrderContext context) { context.setState(new CancelledState()); }
    public void printStatus() { System.out.println("Trạng thái: Đang xử lý - Đóng gói & vận chuyển."); }
}