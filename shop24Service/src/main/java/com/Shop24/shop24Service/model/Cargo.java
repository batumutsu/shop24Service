package com.Shop24.shop24Service.model;

public class Cargo {
    private Long cargoId;
    private String cargoName;
    private Long cargoLocation;
    private Boolean isActive;

    public Cargo() {
    }

    public Cargo(Long cargoId, String cargoName, Long cargoLocation, Boolean isActive) {
        this.cargoId = cargoId;
        this.cargoName = cargoName;
        this.cargoLocation = cargoLocation;
        this.isActive = isActive;
    }

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public Long getCargoLocation() {
        return cargoLocation;
    }

    public void setCargoLocation(Long cargoLocation) {
        this.cargoLocation = cargoLocation;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
