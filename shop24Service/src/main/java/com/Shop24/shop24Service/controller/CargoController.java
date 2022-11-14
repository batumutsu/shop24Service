package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping()
    public List<Cargo> getAllCargo() {
        return cargoService.getAllCargo();
    }

    @GetMapping("{cargoId}")
    public Cargo getCargoDetails(@PathVariable("cargoId") String cargoId) {
        return cargoService.getCargoDetails(cargoId);
    }

    @PostMapping("/getCargoVolumeByDates")
    public List<Drinks> getCargoVolumeByDates(@RequestBody Cargo cargo) {
        System.out.println("+++++id+++++"+cargo.getCargoId());
        System.out.println("++++start++++++"+cargo.getStartDate());
        System.out.println("+++++end+++++"+cargo.getEndDate());
        return cargoService.getCargoVolumeByDates(cargo);
    }

    @PostMapping("/createCargoDetails")
    public String createCargoDetails(@RequestBody Cargo cargo) {
        return cargoService.createCargoDetails(cargo);
    }
}
