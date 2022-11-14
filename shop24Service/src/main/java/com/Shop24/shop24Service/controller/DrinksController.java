package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/drinks")
public class DrinksController {

    @Autowired
    DrinksService drinksService;
    public DrinksController(DrinksService drinksService) {
        this.drinksService = drinksService;
    }

    @GetMapping()
    public List<Drinks> getAllDrinks(){
        return drinksService.getAllDrinks();
    }

    @GetMapping("/getMostConsumedDrinks")
    public List<Drinks> getMostConsumedDrinks(){
        return drinksService.getMostConsumedDrinks();
    }

    @GetMapping("/getAvailableDrinksAndCargo/{clientId}")
    public List<Drinks> getAvailableDrinksAndCargo(@PathVariable("clientId") String clientId) {
        return drinksService.getAvailableDrinksAndCargo(clientId);
    }

    @GetMapping("{drinkId}")
    public Drinks getDrinkDetails(@PathVariable("drinkId") String drinkId){
        return drinksService.getDrinkDetails(drinkId);
    }

    @PostMapping("/createDrinkDetails")
    public String createDrinkDetails(@RequestBody Drinks drink){
        return drinksService.createDrinkDetails(drink);
    }
}
