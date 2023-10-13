package org.example;

import java.util.UUID;

public class DeliveryAddress {
    private UUID orderId;
    private UUID addressId;
    private String address;

    public DeliveryAddress() {
    }

    public DeliveryAddress(UUID orderId, UUID addressId, String address) {
        this.orderId = orderId;
        this.addressId = addressId;
        this.address = address;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getAddressId() {
        return addressId;
    }

    public void setAddressId(UUID addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "orderId=" + orderId +
                ", addressId=" + addressId +
                ", address='" + address + '\'' +
                '}';
    }
}
