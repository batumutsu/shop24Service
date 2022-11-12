package com.Shop24.shop24Service.model;

import javax.persistence.*;

@Entity
@Table(name = "drinks_details")
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drinkId;
    private String drinkName;
    private Long drinkPrice;
    private Boolean isInStock;

    public Drinks() {
    }

    public Drinks(Long drinkId, String drinkName, Long drinkPrice, Boolean isInStock) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.isInStock = isInStock;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
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

