package com.order.system;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(Order order) { super(order); }
    @Override
    public double getPrice() { return decoratedOrder.getPrice() + 5.0; }
    @Override
    public String getDescription() { return decoratedOrder.getDescription() + " + Gói quà"; }
}