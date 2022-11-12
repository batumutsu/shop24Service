package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.repository.ClientRepository;
import com.Shop24.shop24Service.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientDetails(Long clientId) {
        return clientRepository.findById(clientId.toString()).get();
    }

    @Override
    public List<Cargo> getClientClosestCargo(Long clientId) {
        return null;
    }

    @Override
    public Client createClientDetails(Client client) {
        return clientRepository.save(client);
    }
}
