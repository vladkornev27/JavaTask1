package org.example;

import java.util.UUID;

public class Warehouse {
    private UUID productId;
    private UUID orderId;
    private UUID warehouseId;
    private String address;

    public Warehouse() {
    }

    public Warehouse(UUID productId, UUID orderId, UUID warehouseId, String address) {
        this.productId = productId;
        this.orderId = orderId;
        this.warehouseId = warehouseId;
        this.address = address;
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

    public UUID getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(UUID warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "productId=" + productId +
                ", orderId=" + orderId +
                ", warehouseId=" + warehouseId +
                ", address='" + address + '\'' +
                '}';
    }
}
