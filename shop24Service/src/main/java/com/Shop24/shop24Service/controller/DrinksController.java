package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.service.DrinksService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/drinks")
public class DrinksController {

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

    @GetMapping("/getAvailableDrinksAndCargo")
    public List<Drinks> getAvailableDrinksAndCargo() {
        return drinksService.getAvailableDrinksAndCargo();
    }

    @GetMapping("{drinkId}")
    public Drinks getDrinkDetails(@PathVariable("drinkId") Long drinkId){
        return drinksService.getDrinkDetails(drinkId);
    }

    @PostMapping("/createDrinkDetails")
    public String createDrinkDetails(@RequestBody Drinks drink){
        return drinksService.createDrinkDetails(drink);
    }
}
