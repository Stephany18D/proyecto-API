/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KarbonPollo.api.repository;

import com.KarbonPollo.api.model.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nico
 */
public interface clienteinterface extends JpaRepository <cliente, Long> {
    
}
