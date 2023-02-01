package com.itkolleg.kassenprogamm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String uid;
    private String name;
    private double price;
    private Boolean inStock;
    private String description;

    public Product( String uid, String name, double price, Boolean inStock,String description){
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.description = description;
    }

}
