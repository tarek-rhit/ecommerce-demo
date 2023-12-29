package com.example.ecommercedemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "prix")
    private Float prix;
    @Column(name = "quantity")
    private Float quantity;

    @ManyToOne
    @JoinTable(name="panier_list_produit",joinColumns = @JoinColumn(name="id_produit"),
            inverseJoinColumns = @JoinColumn(name="id_panier"))
    private Panier panier;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
