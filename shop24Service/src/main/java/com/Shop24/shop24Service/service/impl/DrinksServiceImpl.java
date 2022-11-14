package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.repository.DrinksRepository;
import com.Shop24.shop24Service.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinksServiceImpl implements DrinksService {

    @Autowired
    DrinksRepository drinksRepository;
    public DrinksServiceImpl(DrinksRepository drinksRepository) {
        this.drinksRepository = drinksRepository;
    }


    @Override
    public List<Drinks> getAllDrinks() {
        return drinksRepository.findAll();
    }

    @Override
    public List<Drinks> getMostConsumedDrinks() {

        List<Drinks> mostConsumedDrinks = drinksRepository.getMostConsumedDrinksRepo().isEmpty() ? null :
                drinksRepository.getMostConsumedDrinksRepo().stream().map(objects -> {
                    Drinks mostConsumedDrink = new Drinks();
                    mostConsumedDrink.setDrinkName(objects[0].toString());
                    mostConsumedDrink.setQuantity(objects[1].toString());
                    return mostConsumedDrink;
                }).toList();
        return mostConsumedDrinks;
    }

    @Override
    public List<Drinks> getAvailableDrinksAndCargo(String clientId) {
        List<Drinks> availableDrinksAndCargo = drinksRepository.getAvailableDrinksAndCargo(clientId).isEmpty() ? null :
                drinksRepository.getAvailableDrinksAndCargo(clientId).stream().map(objects -> {
                    Drinks drinksAndCargo = new Drinks();
                    drinksAndCargo.setDrinkName(objects[0].toString());
                    drinksAndCargo.setCargoName(objects[1].toString());
                    return drinksAndCargo;
                }).toList();
        return availableDrinksAndCargo;
    }

    @Override
    public Drinks getDrinkDetails(String drinkId) {
        Optional<Drinks> drinks = drinksRepository.findById(drinkId);
        return drinks.isPresent() ? drinks.get() : null;
    }

    @Override
    public String createDrinkDetails(Drinks drinks) {
        drinksRepository.save(drinks);
        return "Drink created successfully.";
    }
}
