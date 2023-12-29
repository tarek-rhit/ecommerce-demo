package com.example.ecommercedemo.controller;

import com.example.ecommercedemo.model.Categorie;
import com.example.ecommercedemo.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categorie")
public class CategorieController {

        @Autowired
        private CategorieService categorieService;


        @PostMapping("/creer")
        public Categorie createCategorie(@RequestBody Categorie categorie ){
        return categorieService.createCategorie(categorie);
        }
        @PutMapping("/modifier")
        public Categorie updateCategorie(@RequestBody Categorie categorie ){
        return categorieService.updateCategorie(categorie);
        }
        @GetMapping("/tous")
        public List<Categorie> getAllCategorie(){
        return categorieService.getAllCategorie();
        }
        @GetMapping("/{cid}")
        public Optional<Categorie> getCategorieById(@PathVariable Long cid){
        return categorieService.getCategorieById(cid);
        }
        @DeleteMapping("/supprimer/{cid}")
        public void deletCategorie(@PathVariable Long cid){
             categorieService.deleteCategorie(cid);
        }
}
