package com.Shop24.shop24Service.model;

public class Drinks {
    private Long drinkId;
    private String drinkDescription;
    private Long drinkPrice;
    private Boolean isInStock;

    public Drinks() {
    }

    public Drinks(Long drinkId, String drinkDescription, Long drinkPrice, Boolean isInStock) {
        this.drinkId = drinkId;
        this.drinkDescription = drinkDescription;
        this.drinkPrice = drinkPrice;
        this.isInStock = isInStock;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
    }

    public Long getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Long drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public Boolean getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Boolean isInStock) {
        this.isInStock = isInStock;
    }
}

