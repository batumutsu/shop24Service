package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.repository.CargoRepository;
import com.Shop24.shop24Service.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    CargoRepository cargoRepository;

    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public List<Cargo> getAllCargo() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo getCargoDetails(String cargoId) {
        Optional<Cargo> cargo = cargoRepository.findById(cargoId);
        return cargo.isPresent() ? cargo.get() : null;
    }

    @Override
    public List<Drinks> getCargoVolumeByDates(Cargo cargo) {
        List<Drinks> cargoVolumeByDates = cargoRepository.getCargoVolumeByDates(cargo.getCargoId(), cargo.getStartDate(),
                cargo.getEndDate()).isEmpty() ? null :
                cargoRepository.getCargoVolumeByDates(cargo.getCargoId(), cargo.getStartDate(),
                        cargo.getEndDate()).stream().map(objects -> {
                    Drinks drinks = new Drinks();
                    drinks.setOrderId(objects[0].toString());
                    drinks.setDrinkName(objects[1].toString());
                    drinks.setQuantity(objects[2].toString());
                    drinks.setDrinkPrice(objects[3].toString());
                    drinks.setCargoName(objects[4].toString());
                    drinks.setOrderDate((Timestamp) objects[5]);
                    return drinks;
                }).toList();
        return cargoVolumeByDates;
    }

    @Override
    public String createCargoDetails(Cargo cargo) {
        cargoRepository.save(cargo);
        return "Cargo created successfully.";
    }
}
