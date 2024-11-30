/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.cliente;

/**
 *
 * @author Nico
 */
public interface clienteservicio {
    
    cliente newcliente(cliente newcliente);
    Iterable<cliente> getAll();
    cliente modifycliente (cliente cliente);
    Boolean deletecliente (Long idcliente);
}
