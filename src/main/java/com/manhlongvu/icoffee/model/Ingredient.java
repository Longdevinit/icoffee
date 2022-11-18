package com.manhlongvu.icoffee.model;

public class Ingredient {
    private int venderID;
    private String ingredientName;

    public Ingredient() {
    }

    public int getVenderID() {
        return venderID;
    }

    public void setVenderID(int venderID) {
        this.venderID = venderID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
