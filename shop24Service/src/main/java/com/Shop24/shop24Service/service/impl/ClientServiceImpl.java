package com.Shop24.shop24Service.service.impl;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.repository.ClientRepository;
import com.Shop24.shop24Service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientDetails(String clientId) {
        Optional<Client> client = clientRepository.findById(clientId);
        return client.isPresent() ? client.get() : null;
    }

    @Override
    public List<Cargo> getClientClosestCargo(Long clientId) {
        List<Cargo> clientClosestCargo = clientRepository.getClientClosestCargo(clientId.toString()).isEmpty() ? null :
                clientRepository.getClientClosestCargo(clientId.toString()).stream().map(objects -> {
                    Cargo cargo = new Cargo();
                    cargo.setCargoName(objects[0].toString());
                    cargo.setCargoLocation(objects[1].toString());
                    cargo.setActive((Boolean) objects[2]);
                    return cargo;
                }).toList();
        return clientClosestCargo;
    }

    @Override
    public String createClientDetails(Client client) {
        clientRepository.save(client);
        return "Client created successfully";
    }
}
