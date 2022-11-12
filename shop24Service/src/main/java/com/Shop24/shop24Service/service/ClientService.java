package com.Shop24.shop24Service.service;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;

import java.util.List;

public interface ClientService {
    public List<Client> getAllClients();
    public Client getClientDetails(Long clientId);
    public List<Cargo> getClientClosestCargo(Long clientId);
    public Client createClientDetails(Client client);
}
