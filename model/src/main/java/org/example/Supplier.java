package org.example;

import java.util.UUID;

public class Supplier {
    private UUID productId;
    private UUID orderId;
    private UUID supplierId;
    private String name;

    public Supplier() {
    }

    public Supplier(UUID productId, UUID orderId, UUID supplierId, String name) {
        this.productId = productId;
        this.orderId = orderId;
        this.supplierId = supplierId;
        this.name = name;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(UUID supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "productId=" + productId +
                ", orderId=" + orderId +
                ", supplierId=" + supplierId +
                ", name='" + name + '\'' +
                '}';
    }
}
