package com.example.hr.service;

import java.util.List;

import com.example.hr.model.Client;

public interface ClientService {
    List<Client> getAllClients();
    Client saveClient(Client client);
    Client getClientById(Long id);
}
