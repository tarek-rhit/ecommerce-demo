package com.example.ecommercedemo.service;

import com.example.ecommercedemo.model.Panier;
import com.example.ecommercedemo.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PanierService {

    @Autowired
    private PanierRepository panierRepository;

    public Panier createPanier(Panier panier){
        return panierRepository.save(panier);
    }
    public Panier updatePanier(Panier panier){
        return panierRepository.save(panier);
    }

    public Optional<Panier> getPanierById(Long pid){
        return panierRepository.findById(pid);
    }

    public List<Panier> getAllPanier(){
        return panierRepository.findAll();
    }

    public void deletePanier(Long pid){
         panierRepository.deleteById(pid);
    }

}
