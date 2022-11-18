package com.manhlongvu.icoffee.model;

import java.util.Date;

public class Vender {
    private String venderName;
    private double purchasePrice;
    private Date inputDay, outputDay;

    public Vender() {
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getInputDay() {
        return inputDay;
    }

    public void setInputDay(Date inputDay) {
        this.inputDay = inputDay;
    }

    public Date getOutputDay() {
        return outputDay;
    }

    public void setOutputDay(Date outputDay) {
        this.outputDay = outputDay;
    }
}
