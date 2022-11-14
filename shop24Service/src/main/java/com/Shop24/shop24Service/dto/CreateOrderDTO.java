package com.Shop24.shop24Service.dto;

import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.model.Drinks;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderDTO {
    private Client client;
    private List<Drinks> drinks;

    public CreateOrderDTO() {
    }

    public CreateOrderDTO(Client client, List<Drinks> drinks) {
        this.client = client;
        this.drinks = drinks;
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
}
