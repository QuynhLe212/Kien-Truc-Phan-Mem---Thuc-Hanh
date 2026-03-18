package com.order.system;

public class CancelledState implements OrderState {
    public void next(OrderContext context) { System.out.println("Lỗi: Đơn hàng đã hủy."); }
    public void cancel(OrderContext context) { System.out.println("Đơn hàng đã hủy rồi."); }
    public void printStatus() { System.out.println("Trạng thái: Đã hủy - Đang hoàn tiền."); }
}