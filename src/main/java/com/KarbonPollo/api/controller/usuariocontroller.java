/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.controller;

import com.KarbonPollo.api.model.usuario;
import com.KarbonPollo.api.services.usuarioservicio;
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
@RequestMapping("/usuario")
public class usuariocontroller {

    @Autowired
    private usuarioservicio Usuarioservicio;

    @PostMapping("/nuevo")
    public usuario newUsuario(@RequestBody usuario newusuario) {
        return this.Usuarioservicio.newusuario(newusuario);
    }

    @GetMapping("/mostrar")
    public Iterable<usuario> getAll() {
        return Usuarioservicio.getAll();
    }

    @PostMapping("/modificar")
    public usuario updateUsuario(@RequestBody usuario Usuario) {
        return this.Usuarioservicio.modifyusuario(Usuario);
    }

    @PostMapping(value="/{id}")
    public Boolean deleteUsuario(@PathVariable(value="id") Long id) {
        return this.Usuarioservicio.deleteusuario(id);
    }
}
