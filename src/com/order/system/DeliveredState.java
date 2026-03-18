package com.order.system;

public class DeliveredState implements OrderState {
    public void next(OrderContext context) { System.out.println("Đơn hàng đã hoàn tất."); }
    public void cancel(OrderContext context) { System.out.println("Lỗi: Không thể hủy đơn hàng đã giao."); }
    public void printStatus() { System.out.println("Trạng thái: Đã giao thành công."); }
}