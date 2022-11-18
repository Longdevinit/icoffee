package com.manhlongvu.icoffee.model;

public class Transaction {
    private int storeID, venderID, amount;

    public Transaction() {
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public int getVenderID() {
        return venderID;
    }

    public void setVenderID(int venderID) {
        this.venderID = venderID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
