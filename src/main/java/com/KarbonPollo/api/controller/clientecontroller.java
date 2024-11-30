/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.controller;

import com.KarbonPollo.api.model.cliente;
import com.KarbonPollo.api.services.clienteservicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nico
 */
@RestController
@RequestMapping("/cliente")
public class clientecontroller {
    
    @Autowired
    private clienteservicio Clienteservicio;
    
    @PostMapping ("/nuevo")
    public cliente newCliente (@RequestBody cliente newcliente){
       
        return this.Clienteservicio.newcliente(newcliente);
    }
    
    @GetMapping("/mostrar")
    public Iterable<cliente> getAll(){
        return Clienteservicio.getAll();
    }
    
    
    @PostMapping("/modificar")
    public cliente updateCliente(@RequestBody cliente Cliente){
        return this.Clienteservicio.modifycliente(Cliente);
    }
    
    @PostMapping(value="/{id}")
    public Boolean deletecliente(@PathVariable(value="id")Long id){
        return this.Clienteservicio.deletecliente(id);
    }
}
