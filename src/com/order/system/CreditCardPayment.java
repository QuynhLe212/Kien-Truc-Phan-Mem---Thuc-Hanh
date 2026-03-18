package com.order.system;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán " + amount + " qua thẻ tín dụng.");
	}
}
