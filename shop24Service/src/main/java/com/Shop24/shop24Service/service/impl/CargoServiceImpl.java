package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Drinks;
import com.Shop24.shop24Service.repository.CargoRepository;
import com.Shop24.shop24Service.service.CargoService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class CargoServiceImpl implements CargoService {

    CargoRepository cargoRepository;

    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public List<Cargo> getAllCargo() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo getCargoDetails(Long cargoId) {
        return cargoRepository.findById(cargoId.toString()).get();
    }

    @Override
    public List<Drinks> getCargoVolumeByDates(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public String createCargoDetails(Cargo cargo) {
        cargoRepository.save(cargo);
        return "Cargo created successfully.";
    }
}
