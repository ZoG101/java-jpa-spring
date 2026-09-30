package com.example.demo.models.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private final Integer code;

    OrderStatus(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }

    public static OrderStatus valueOf(Integer code) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getCode() == code) return orderStatus;
        }

        throw new IllegalArgumentException("The code provided is not an Order_Status!");
    }
}
