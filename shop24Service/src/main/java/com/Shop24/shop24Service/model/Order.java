package com.Shop24.shop24Service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "order_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private String rowNo;
    private String orderId;
    @Transient
    private String clientName;
    @Transient
    private String drinkName;
    private String clientId;
    private String drinkId;
    private String quantity;
    private String cargoId;
    private String drinkPrice;
    @Transient
    private String totalDrinksPrice;
    private Boolean isPaid;
    private Boolean isComplete;
    private Date completedDate;

    @Transient
    private String cargoName;

    public Order() {
    }

    public Order(String rowNo, String orderId, String clientName, String drinkName, String clientId, String drinkId, String quantity, String cargoId, String drinkPrice, String totalDrinksPrice, Boolean isPaid, Boolean isComplete, Date completedDate, String cargoName) {
        this.rowNo = rowNo;
        this.orderId = orderId;
        this.clientName = clientName;
        this.drinkName = drinkName;
        this.clientId = clientId;
        this.drinkId = drinkId;
        this.quantity = quantity;
        this.cargoId = cargoId;
        this.drinkPrice = drinkPrice;
        this.totalDrinksPrice = totalDrinksPrice;
        this.isPaid = isPaid;
        this.isComplete = isComplete;
        this.completedDate = completedDate;
        this.cargoName = cargoName;
    }

    public String getRowNo() {
        return rowNo;
    }

    public void setRowNo(String rowNo) {
        this.rowNo = rowNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(String drinkId) {
        this.drinkId = drinkId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getTotalDrinksPrice() {
        return totalDrinksPrice;
    }

    public void setTotalDrinksPrice(String totalDrinksPrice) {
        this.totalDrinksPrice = totalDrinksPrice;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }
}
