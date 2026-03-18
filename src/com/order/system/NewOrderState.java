package com.order.system;

public class NewOrderState implements OrderState {
    public void next(OrderContext context) { context.setState(new ProcessingState()); }
    public void cancel(OrderContext context) { context.setState(new CancelledState()); }
    public void printStatus() { System.out.println("Trạng thái: Mới tạo - Đang kiểm tra thông tin."); }
}