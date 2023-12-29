package com.example.ecommercedemo.service;

import com.example.ecommercedemo.model.Produit;
import com.example.ecommercedemo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {


    @Autowired
    private ProduitRepository produitRepository;


    public Produit createProduit(Produit panier){
        return produitRepository.save(panier);
    }
    public Produit updateProduit(Produit panier){
        return produitRepository.save(panier);
    }

    public Optional<Produit> getProduitById(Long pid){
        return produitRepository.findById(pid);
    }

    public List<Produit> getAllProduit(){
        return produitRepository.findAll();
    }

    public void deleteProduit(Long pid){
        produitRepository.deleteById(pid);

    }

}
