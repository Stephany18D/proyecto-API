/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author Nico
 */
@Entity
public class menu {
    @Id
    @Column
    private Long idmenu;

    @Column
    private String nombrePlatillo;

    @Column
    private String descripcion;

    @Column
    private Double precio;

    // Getters
    public Long getIdmenu() {
        return idmenu;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    // Setters
    public void setIdmenu(Long idmenu) {
        this.idmenu = idmenu;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
