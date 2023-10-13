package org.example;

import java.util.List;
import java.util.UUID;

public class OrderProducts {
    private UUID orderId;
    private int total;
    private String orderStatus;
    private Customer customer;
    private List<Product> products;
    private DeliveryAddress address;

    public OrderProducts() {
    }

    public OrderProducts(UUID orderId, int total, String orderStatus, Customer customer, List<Product> products, DeliveryAddress address) {
        this.orderId = orderId;
        this.total = total;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.products = products;
        this.address = address;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public DeliveryAddress getAddress() {
        return address;
    }

    public void setAddress(DeliveryAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderProducts{" +
                "orderId=" + orderId +
                ", total=" + total +
                ", orderStatus='" + orderStatus + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                ", address=" + address +
                '}';
    }
}
