package org.example;

import java.util.UUID;

public class Customer {
    private UUID orderId;
    private UUID productId;
    private UUID customerId;
    private String name;
    private String mail;

    public Customer() {
    }

    public Customer(UUID orderId, UUID productId, UUID customerId, String name, String mail) {
        this.orderId = orderId;
        this.productId = productId;
        this.customerId = customerId;
        this.name = name;
        this.mail = mail;
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

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
