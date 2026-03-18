package com.payment.system;

public class PendingState implements TransactionState {
    @Override
    public void handle(TransactionContext context) {
        System.out.println("Giao dịch đang chờ. Bắt đầu xác thực...");
        context.setState(new ProcessingState());
    }
    @Override public String getStatus() { return "ĐANG CHỜ"; }
}