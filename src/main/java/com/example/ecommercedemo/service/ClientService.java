package com.example.ecommercedemo.service;


import com.example.ecommercedemo.model.Client;
import com.example.ecommercedemo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client){
        return clientRepository.save(client);
    }
    public Client updateClient(Client client){
        return clientRepository.save(client);
    }

    public Optional<Client> getClientById(Long pid){
        return clientRepository.findById(pid);
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    public void deleteClient(Long pid){
        clientRepository.deleteById(pid);
    }
}
