package com.tax.system;

public class ActiveState implements ProductState {
    @Override
    public void processTax(ProductContext context) {
        double tax = context.getProduct().getTotalTax();
        double total = context.getProduct().getBasePrice() + tax;
        System.out.println("=> Tính toán thành công!");
        System.out.println("   Tiền hàng: " + context.getProduct().getBasePrice());
        System.out.println("   Tổng thuế: " + tax);
        System.out.println("   Tổng thanh toán: " + total);
    }
    @Override
    public String getStatusName() { return "Đang kinh doanh"; }
}