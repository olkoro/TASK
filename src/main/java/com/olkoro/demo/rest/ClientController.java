package com.olkoro.demo.rest;

import com.olkoro.demo.model.Client;
import com.olkoro.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(com.olkoro.demo.repository.ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients/all")
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

}
