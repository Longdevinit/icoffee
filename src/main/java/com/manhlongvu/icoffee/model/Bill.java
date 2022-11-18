package com.manhlongvu.icoffee.model;

import java.util.Date;

public class Bill {
    private int billID,orderID;
    private double amountToPay, amountToPaid;
    private Date paymentTime;

    public Bill() {
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public double getAmountToPaid() {
        return amountToPaid;
    }

    public void setAmountToPaid(double amountToPaid) {
        this.amountToPaid = amountToPaid;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
}
