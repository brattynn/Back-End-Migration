package com.d288.d288.services;

import java.util.Objects;

public class PurchaseResponse {
    private String orderTrackingNumber;

    // No-args constructor
    public PurchaseResponse() { }

    // All args constructor
    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = Objects.requireNonNull(orderTrackingNumber);
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    @Override
    public String toString() {
        return orderTrackingNumber;
    }

    public PurchaseResponse getCart() {
        return null;
    }
}