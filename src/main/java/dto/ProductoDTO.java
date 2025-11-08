package com.example.plantilla.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ProductoDTO {

    private Long id;
    private String nombre;
    private Integer stock;
    private Double precio;
    private String categoria;


    public ProductoDTO(Long id, String nombre, Integer stock, Double precio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }

}

