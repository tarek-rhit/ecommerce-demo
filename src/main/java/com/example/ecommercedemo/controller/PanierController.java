package com.example.ecommercedemo.controller;

import com.example.ecommercedemo.model.Panier;
import com.example.ecommercedemo.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/panier")
public class PanierController {

    @Autowired
    private PanierService panierService;

    @PostMapping("/creer")
    public Panier createPanier(@RequestBody Panier panier ){
        return panierService.createPanier(panier);
    }
    @PutMapping("/modifier")
    public Panier updatePanier(@RequestBody Panier panier ){
        return panierService.updatePanier(panier);
    }
    @GetMapping("/tous")
    public List<Panier> getAllPanier(){
        return panierService.getAllPanier();
    }
    @GetMapping("/{pid}")
    public Optional<Panier> getPanierById(@PathVariable Long pid){
        return panierService.getPanierById(pid);
    }
    @DeleteMapping("/supprimer/{pid}")
    public void deletePanier(@PathVariable Long pid){
        panierService.deletePanier(pid);
    }


}
