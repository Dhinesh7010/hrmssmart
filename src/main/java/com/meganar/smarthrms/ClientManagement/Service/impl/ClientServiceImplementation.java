package com.meganar.smarthrms.ClientManagement.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meganar.smarthrms.ClientManagement.Model.Client;
import com.meganar.smarthrms.ClientManagement.Repository.ClientRepository;
import com.meganar.smarthrms.ClientManagement.Service.ClientService;

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
