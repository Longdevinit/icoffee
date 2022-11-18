package com.manhlongvu.icoffee.model;

public class OrderProduct {
    private int orderID;
    private String productName;

    public OrderProduct() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
