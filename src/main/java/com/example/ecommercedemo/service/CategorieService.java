package com.example.ecommercedemo.service;

import com.example.ecommercedemo.model.Categorie;

import com.example.ecommercedemo.repository.CategorieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Categorie createCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }
    public Categorie updateCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    public Optional<Categorie> getCategorieById(Long pid){
        return categorieRepository.findById(pid);
    }

    public List<Categorie> getAllCategorie(){
        return categorieRepository.findAll();
    }

    public void deleteCategorie(Long pid){
        categorieRepository.deleteById(pid);
    }
}
