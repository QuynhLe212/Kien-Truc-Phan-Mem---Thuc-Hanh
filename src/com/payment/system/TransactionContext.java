package com.payment.system;

public class TransactionContext {
    private TransactionState state = new PendingState();
    private PaymentMethod method;
    private PaymentAmount amount;

    public TransactionContext(PaymentAmount amt, PaymentMethod meth) {
        this.amount = amt;
        this.method = meth;
    }

    public void setState(TransactionState s) { this.state = s; }
    public PaymentMethod getPaymentMethod() { return method; }
    public PaymentAmount getFinalAmount() { return amount; }

    public void process() {
        System.out.println("\n[Hệ thống] " + amount.getDescription());
        System.out.println("[Trạng thái] " + state.getStatus());
        state.handle(this);
    }
}