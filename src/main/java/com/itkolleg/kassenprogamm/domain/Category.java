package com.itkolleg.kassenprogamm.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

public @Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
 class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String uid;

    @Size(min = 2, message = "Der Kategorie '${validatedValue}' ist ungültig. Studentennamen müssen mindestens {min} Zeichen lang sein.")
    private String name;

    public Category(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }
}