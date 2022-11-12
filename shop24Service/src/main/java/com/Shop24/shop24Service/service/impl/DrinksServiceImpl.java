package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.repository.DrinksRepository;
import com.Shop24.shop24Service.service.DrinksService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DrinksServiceImpl implements DrinksService {

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
        return null;
    }

    @Override
    public List<Drinks> getAvailableDrinksAndCargo() {
        return null;
    }

    @Override
    public Drinks getDrinkDetails(Long drinkId) {
        return drinksRepository.findById(drinkId.toString()).get();
    }

    @Override
    public String createDrinkDetails(Drinks drinks) {
        drinksRepository.save(drinks);
        return "Drink created successfully.";
    }
}
