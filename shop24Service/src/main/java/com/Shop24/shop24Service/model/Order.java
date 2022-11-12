package com.Shop24.shop24Service.model;

import java.sql.Date;

public class Order {
    private Long rowNo;
    private Long orderId;
    private Long clientId;
    private Long drinkId;
    private Long cargoId;
    private Long drinkPrice;
    private Boolean isPaid;
    private Boolean isComplete;
    private Date insertDate;
    private Date orderCompletedDate;

    public Order() {
    }

    public Order(Long rowNo, Long orderId, Long clientId, Long drinkId, Long cargoId, Long drinkPrice, Boolean isPaid, Boolean isComplete, Date insertDate, Date orderCompletedDate) {
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

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public Long getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(Long drinkPrice) {
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
