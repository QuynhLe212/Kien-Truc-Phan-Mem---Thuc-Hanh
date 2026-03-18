package com.order.system;

public class CODByCash implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán " + amount + " khi nhận hàng (COD).");
	}
}
