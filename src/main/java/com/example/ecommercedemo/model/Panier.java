package com.example.ecommercedemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="panier")
public class Panier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Timestamp dateDajout;
    @Column
    private Double Total;
    @Column
    private Integer nombreProduit;

    @OneToMany(mappedBy = "panier")
    private List<Produit> produitList;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
