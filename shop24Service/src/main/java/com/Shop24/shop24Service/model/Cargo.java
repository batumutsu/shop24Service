package com.Shop24.shop24Service.model;

import javax.persistence.*;

@Entity
@Table(name = "cargo_details")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cargoId;
    private String cargoName;
    private String cargoLocation;
    private Boolean isActive;

    public Cargo() {
    }

    public Cargo(String cargoId, String cargoName, String cargoLocation, Boolean isActive) {
        this.cargoId = cargoId;
        this.cargoName = cargoName;
        this.cargoLocation = cargoLocation;
        this.isActive = isActive;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getCargoLocation() {
        return cargoLocation;
    }

    public void setCargoLocation(String cargoLocation) {
        this.cargoLocation = cargoLocation;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
