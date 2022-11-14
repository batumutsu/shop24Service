package com.Shop24.shop24Service.dto;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.model.Order;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private List<Order> orders;
    private Client client;
    private Cargo cargo;
    private List<Drinks> drinks;

    public OrderDTO() {
    }

    public OrderDTO(Client client, List<Drinks> drinks, Cargo cargo, List<Order> orders) {
        this.client = client;
        this.drinks = drinks;
        this.cargo = cargo;
        this.orders = orders;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
