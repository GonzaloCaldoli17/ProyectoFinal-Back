package com.grupo3.digitalbook.demo.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TipoProducto") // Constructor con todos los parámetros
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String descripcion;

    public TipoProducto() {
    }

    public TipoProducto(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public TipoProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
