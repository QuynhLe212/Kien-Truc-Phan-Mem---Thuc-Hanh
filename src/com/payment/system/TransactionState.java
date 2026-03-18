package com.payment.system;

public interface TransactionState {
    void handle(TransactionContext context);
    String getStatus();
}