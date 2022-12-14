package com.Shop24.shop24Service.controller;

import com.Shop24.shop24Service.model.Cargo;
import com.Shop24.shop24Service.model.Client;
import com.Shop24.shop24Service.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping()
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("{clientId}")
    public Client getClientDetails(@PathVariable("clientId") String clientId) {
        return clientService.getClientDetails(clientId);
    }

    @GetMapping("/getClientClosestCargo/{clientId}")
    public List<Cargo> getClientClosestCargo(@PathVariable("clientId") Long clientId) {
        return clientService.getClientClosestCargo(clientId);
    }

    @PostMapping("/createClientDetails")
    public String createClientDetails(@RequestBody Client client) {
        return clientService.createClientDetails(client);
    }

}
