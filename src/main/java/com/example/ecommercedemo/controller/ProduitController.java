package com.example.ecommercedemo.controller;

import com.example.ecommercedemo.model.Produit;
import com.example.ecommercedemo.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitService produitService;


    @PostMapping("/creer")
    public Produit createProduit(@RequestBody Produit produit ){
        return produitService.createProduit(produit);
    }
    @PutMapping("/modifier")
    public Produit updateProduit(@RequestBody Produit produit ){
        return produitService.updateProduit(produit);
    }
    @GetMapping("/tous")
    public List<Produit> getAllProduit(){
        return produitService.getAllProduit();
    }
    @GetMapping("/{pid}")
    public Optional<Produit> getProduitById(@PathVariable Long pid){
        return produitService.getProduitById(pid);
    }
    @DeleteMapping("/supprimer/{pid}")
    public void deletProduit(@PathVariable Long pid){
        produitService.deleteProduit(pid);
    }



}
