package org.example;

import java.util.UUID;

public class Product {
    private UUID orderId;
    private UUID productId;
    private String name;
    private int price;
    private Supplier supplier;
    private Warehouse warehouse;

    public Product() {
    }

    public Product(UUID orderId, UUID productId, String name, int price, Supplier supplier, Warehouse warehouse) {
        this.orderId = orderId;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.warehouse = warehouse;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplier=" + supplier +
                ", warehouse=" + warehouse +
                '}';
    }
}
