package com.Shop24.shop24Service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long clientId;
    private String clientName;
    private String clientMobNo;
    private String clientEmail;
    private Long clientLocation;
    private Long clientType;

    public Client() {
    }

    public Client(Long clientId, String clientName, String clientMobNo, String clientEmail, Long clientLocation, Long clientType) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientMobNo = clientMobNo;
        this.clientEmail = clientEmail;
        this.clientLocation = clientLocation;
        this.clientType = clientType;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientMobNo() {
        return clientMobNo;
    }

    public void setClientMobNo(String clientMobNo) {
        this.clientMobNo = clientMobNo;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Long getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(Long clientLocation) {
        this.clientLocation = clientLocation;
    }

    public Long getClientType() {
        return clientType;
    }

    public void setClientType(Long clientType) {
        this.clientType = clientType;
    }
}
