package com.Shop24.shop24Service.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "order_details")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String rowNo;
    private String orderId;
    private String clientId;
    private String drinkId;
    private String cargoId;
    private String drinkPrice;
    private Boolean isPaid;
    private Boolean isComplete;
    private Date insertDate;
    private Date orderCompletedDate;

    public Order() {
    }

    public Order(String rowNo, String orderId, String clientId, String drinkId, String cargoId, String drinkPrice, Boolean isPaid, Boolean isComplete, Date insertDate, Date orderCompletedDate) {
        this.rowNo = rowNo;
        this.orderId = orderId;
        this.clientId = clientId;
        this.drinkId = drinkId;
        this.cargoId = cargoId;
        this.drinkPrice = drinkPrice;
        this.isPaid = isPaid;
        this.isComplete = isComplete;
        this.insertDate = insertDate;
        this.orderCompletedDate = orderCompletedDate;
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

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getOrderCompletedDate() {
        return orderCompletedDate;
    }

    public void setOrderCompletedDate(Date orderCompletedDate) {
        this.orderCompletedDate = orderCompletedDate;
    }
}
