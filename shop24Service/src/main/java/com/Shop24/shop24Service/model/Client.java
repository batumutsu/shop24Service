package com.Shop24.shop24Service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@Table(name = "client_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonIgnore
    private String clientId;
    private String clientName;
    private String clientMobNo;
    private String clientEmail;
    private String clientLocation;
    private String clientType;

    public Client() {
    }

    public Client(String clientId, String clientName, String clientMobNo, String clientEmail, String clientLocation, String clientType) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientMobNo = clientMobNo;
        this.clientEmail = clientEmail;
        this.clientLocation = clientLocation;
        this.clientType = clientType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
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

    public String getClientLocation() {
        return clientLocation;
    }

    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
}
