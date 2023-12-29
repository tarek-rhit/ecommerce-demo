package com.example.ecommercedemo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String nomUtilisateur;
    @Column
    private String motDePasse;
    @Column
    private String email;
    @Column
    private String tel;
    @Column
    private String adresse;

    @OneToMany
    @JoinColumn(name = "panier_id")
    private List<Panier> panierList;
}
