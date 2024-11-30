/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.usuario;
import com.KarbonPollo.api.repository.usuariointerface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */
@Service
public class usuarioservicioimple implements usuarioservicio {

    @Autowired
    private usuariointerface Usuariointerface;

    @Override
    public usuario newusuario(usuario newusuario) {
        return Usuariointerface.save(newusuario);
    }

    @Override
    public Iterable<usuario> getAll() {
        return this.Usuariointerface.findAll();
    }

    @Override
    public usuario modifyusuario(usuario usuario) {
        Optional<usuario> usuarioEncontrado = this.Usuariointerface.findById(usuario.getIdusuario());
        if (usuarioEncontrado.get() != null) {
            usuarioEncontrado.get().setNombre(usuario.getNombre());
            usuarioEncontrado.get().setContrasena(usuario.getContrasena());
            return this.newusuario(usuarioEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteusuario(Long idusuario) {
        this.Usuariointerface.deleteById(idusuario);
        return true;
    }
}
