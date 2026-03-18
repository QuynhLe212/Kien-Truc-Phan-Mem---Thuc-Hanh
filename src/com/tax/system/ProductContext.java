package com.tax.system;

public class ProductContext {
    private Product product;
    private ProductState state = new DraftState();

    public ProductContext(Product p) {
        this.product = p;
    }

    public void setState(ProductState s) { this.state = s; }
    public Product getProduct() { return product; }
    
    public void execute() {
        System.out.println("\nKiểm tra sản phẩm: " + product.getName());
        System.out.println("Trạng thái hiện tại: " + state.getStatusName());
        state.processTax(this);
    }
}