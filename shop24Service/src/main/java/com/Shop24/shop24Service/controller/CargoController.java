package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.service.CargoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.util.List;

public class CargoController {

    CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping()
    public List<Cargo> getAllCargo() {
        return cargoService.getAllCargo();
    }

    @GetMapping("{cargoId}")
    public Cargo getCargoDetails(@PathVariable("cargoId") Long cargoId) {
        return cargoService.getCargoDetails(cargoId);
    }

    @PostMapping("/getCargoVolumeByDates")
    public List<Drinks> getCargoVolumeByDates(@PathVariable("startDate") Date startDate,
                                              @PathVariable("endDate") Date endDate) {
        return cargoService.getCargoVolumeByDates(startDate, endDate);
    }

    @PostMapping("/createCargoDetails")
    public String createCargoDetails(Cargo cargo) {
        return cargoService.createCargoDetails(cargo);
    }
}
