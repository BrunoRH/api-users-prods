package com.example.apimanagement.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tasa {

    @Id
    @GeneratedValue
    private Long id;

    private String nombreTasa;
    private String categoria;
    private Double precio;
    private String image;


}
