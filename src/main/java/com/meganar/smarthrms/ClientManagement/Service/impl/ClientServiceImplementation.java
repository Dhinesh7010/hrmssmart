package com.example.hr.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hr.model.Client;
import com.example.hr.repository.ClientRepository;
import com.example.hr.service.ClientService;

@Service
public class ClientServiceImplementation implements ClientService{
    
    private ClientRepository clientRepository;

    public ClientServiceImplementation(ClientRepository clientRepository){
        super();
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client){
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id){
        return clientRepository.findById(id).get();
    }

}
