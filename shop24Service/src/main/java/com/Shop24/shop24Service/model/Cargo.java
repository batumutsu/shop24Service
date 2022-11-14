package com.Shop24.shop24Service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "cargo_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonIgnore
    private String cargoId;
    private String cargoName;
    private String cargoLocation;
    private Boolean isActive;
    @Transient
    private Date startDate;
    @Transient
    private Date endDate;

    public Cargo() {
    }

    public Cargo(String cargoId, String cargoName, String cargoLocation, Boolean isActive, Date startDate, Date endDate) {
        this.cargoId = cargoId;
        this.cargoName = cargoName;
        this.cargoLocation = cargoLocation;
        this.isActive = isActive;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
