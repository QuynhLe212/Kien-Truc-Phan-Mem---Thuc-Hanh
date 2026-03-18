package com.order.system;

public class BasicOrder implements Order {
    @Override
    public double getPrice() { return 100.0; }
    @Override
    public String getDescription() { return "Đơn hàng cơ bản"; }
}