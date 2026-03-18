package com.payment.system;

public class SuccessState implements TransactionState {
    @Override public void handle(TransactionContext context) {
        System.out.println("Giao dịch đã kết thúc thành công. Không thể xử lý thêm.");
    }
    @Override public String getStatus() { return "THÀNH CÔNG"; }
}