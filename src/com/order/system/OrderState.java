package com.order.system;

public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
    void printStatus();
}