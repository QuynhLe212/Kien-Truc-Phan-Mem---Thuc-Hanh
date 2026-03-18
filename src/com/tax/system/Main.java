package com.tax.system;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo sản phẩm gốc
        Product iphone = new SimpleProduct("iPhone 15 Pro", 1000.0);

        // 2. Áp dụng thuế chồng thuế (Decorator)
        // Vừa chịu VAT 10%, vừa chịu thuế Xa xỉ 20%
        iphone = new AppliedTax(iphone, new VATTax());
        iphone = new AppliedTax(iphone, new LuxuryTax());

        // 3. Đưa vào hệ thống quản lý (Context)
        ProductContext store = new ProductContext(iphone);

        // Chạy khi đang là Nháp
        store.execute();

        System.out.println("------------------------------------");

        // Chạy sau khi Kích hoạt sản phẩm
        store.setState(new ActiveState());
        store.execute();
    }
}