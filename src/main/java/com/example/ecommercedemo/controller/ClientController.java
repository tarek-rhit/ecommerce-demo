package com.example.ecommercedemo.controller;



import com.example.ecommercedemo.model.Client;

import com.example.ecommercedemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @PostMapping("/creer")
    public Client createClient(@RequestBody Client client ){
        return clientService.createClient(client);
    }
    @PutMapping("/modifier")
    public Client updateClient(@RequestBody Client client ){
        return clientService.updateClient(client);
    }
    @GetMapping("/tous")
    public List<Client> getAllCliente(){
        return clientService.getAllClient();
    }
    @GetMapping("/{cid}")
    public Optional<Client> getClientById(@PathVariable Long cid){
        return clientService.getClientById(cid);
    }
    @DeleteMapping("/supprimer/{cid}")
    public void deletClient(@PathVariable Long cid){
        clientService.deleteClient(cid);
    }
}
