package com.payment.system;

public class ProcessingState implements TransactionState {
    @Override
    public void handle(TransactionContext context) {
        context.getPaymentMethod().processPayment(context.getFinalAmount().getAmount());
        System.out.println("Xác thực hoàn tất.");
        context.setState(new SuccessState());
    }
    @Override public String getStatus() { return "ĐANG XỬ LÝ"; }
}