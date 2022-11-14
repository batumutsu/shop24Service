package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.model.Drinks;

import java.util.List;
import java.util.Objects;

public interface DrinksService {
    public List<Drinks> getAllDrinks();
    public List<Drinks> getMostConsumedDrinks();
    public List<Drinks> getAvailableDrinksAndCargo(String clientId);
    public Drinks getDrinkDetails(String drinkId);
    public String createDrinkDetails(Drinks drinks);
}
