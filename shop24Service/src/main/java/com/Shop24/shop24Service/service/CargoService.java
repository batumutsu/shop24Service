package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Drinks;

import java.sql.Date;
import java.util.List;

public interface CargoService {
    public List<Cargo> getAllCargo();
    public Cargo getCargoDetails(String cargoId);
    public List<Drinks> getCargoVolumeByDates(Cargo cargo);
    public String createCargoDetails(Cargo cargo);
}
