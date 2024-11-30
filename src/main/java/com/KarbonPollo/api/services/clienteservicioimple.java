/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.cliente;
import com.KarbonPollo.api.repository.clienteinterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */
@Service
public class clienteservicioimple implements clienteservicio{
    
    @Autowired
    private clienteinterface Clienteinterface;

    @Override
    public cliente newcliente(cliente newcliente) {
        return Clienteinterface.save(newcliente);
    }

    @Override
    public Iterable<cliente> getAll() {
        return this.Clienteinterface.findAll();
    }

    @Override
    public cliente modifycliente(cliente cliente) {
        Optional<cliente> clienteEncontrado=this.Clienteinterface.findById(cliente.getIdcliente());
        if (clienteEncontrado.get()!=null){
          clienteEncontrado.get().setNombre(cliente.getNombre());
          clienteEncontrado.get().setCorreoelectronico(cliente.getCorreoelectronico());
          clienteEncontrado.get().setTelefono(cliente.getTelefono());
          return this.newcliente(clienteEncontrado.get());
          
        }
        return null;    
    }

    @Override
    public Boolean deletecliente(Long idcliente) {
        this.Clienteinterface.deleteById(idcliente);
        return true;
    }
    
}
