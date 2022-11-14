package com.Shop24.shop24Service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "drinks_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Drinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonIgnore
    private String drinkId;
    private String drinkName;
    private String drinkPrice;
    private Boolean isInStock;
    @Transient
    private String quantity;

    private String fkCargoId;
    @Transient
    private String cargoName;
    @Transient
    private String orderId;
    @Transient
    private Timestamp orderDate;

    public Drinks() {
    }

    public Drinks(String drinkId, String drinkName, String drinkPrice, Boolean isInStock, String quantity, String fkCargoId, String cargoName, String orderId, Timestamp orderDate) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.isInStock = isInStock;
        this.quantity = quantity;
        this.fkCargoId = fkCargoId;
        this.cargoName = cargoName;
        this.orderId = orderId;
        this.orderDate = orderDate;
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

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFkCargoId() {
        return fkCargoId;
    }

    public void setFkCargoId(String fkCargoId) {
        this.fkCargoId = fkCargoId;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}

