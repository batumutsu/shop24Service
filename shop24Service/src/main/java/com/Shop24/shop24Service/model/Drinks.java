package com.Shop24.shop24Service.model;

import javax.persistence.*;

@Entity
@Table(name = "drinks_details")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String drinkId;
    private String drinkName;
    private String drinkPrice;
    private Boolean isInStock;

    public Drinks() {
    }

    public Drinks(String drinkId, String drinkName, String drinkPrice, Boolean isInStock) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.isInStock = isInStock;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(String drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public Boolean getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Boolean isInStock) {
        this.isInStock = isInStock;
    }
}

