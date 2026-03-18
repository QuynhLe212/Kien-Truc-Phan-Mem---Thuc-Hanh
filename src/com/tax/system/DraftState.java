package com.tax.system;

public class DraftState implements ProductState {
    @Override
    public void processTax(ProductContext context) {
        System.out.println("Lưu ý: Sản phẩm đang ở trạng thái NHÁP. Thuế chưa được áp dụng chính thức.");
    }
    @Override
    public String getStatusName() { return "Bản nháp"; }
}