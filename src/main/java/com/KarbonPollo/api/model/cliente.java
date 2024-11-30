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

public class cliente {
    @Id
    
    @Column
    private Long idcliente;
    
    @Column
    private String nombre;
    
    @Column
    private String correoelectronico;
    
    @Column 
    private String telefono;
    
    public Long getIdcliente() { 
        return idcliente; 
    } 
    
    public String getNombre() { 
        return nombre; 
    } 
    
    public String getCorreoelectronico() { 
        return correoelectronico; 
    } 
    
    public String getTelefono() {
        return telefono; 
    } 
    
    public void setIdcliente(Long idcliente) { 
        this.idcliente = idcliente; 
    } 
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    } 
    
    public void setCorreoelectronico(String correoelectronico) { 
        this.correoelectronico = correoelectronico; 
    } 
    
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }
}

