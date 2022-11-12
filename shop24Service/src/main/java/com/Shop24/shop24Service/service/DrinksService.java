package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.model.Drinks;

import java.util.List;

public interface DrinksService {
    public List<Drinks> getAllDrinks();
    public List<Drinks> getMostConsumedDrinks();
    public List<Drinks> getAvailableDrinksAndCargo();
    public Drinks getDrinkDetails(Long drinkId);
    public String createDrinkDetails(Drinks drinks);
}
