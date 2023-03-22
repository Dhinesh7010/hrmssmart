package com.meganar.smarthrms.ClientManagement.Service;

import java.util.List;

import com.meganar.smarthrms.ClientManagement.Model.Client;

public interface ClientService {
    List<Client> getAllClients();
    Client saveClient(Client client);
    Client getClientById(Long id);
}
