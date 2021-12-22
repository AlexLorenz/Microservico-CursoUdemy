package com.br.myfood.cadastro.service;

import com.br.myfood.cadastro.entity.Client;
import com.br.myfood.cadastro.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client insertClient(Client client) {
        return clientRepository.save(client);
    }
}
