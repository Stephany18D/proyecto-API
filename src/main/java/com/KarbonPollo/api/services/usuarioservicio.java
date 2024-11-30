/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.usuario;

/**
 *
 * @author Nico
 */
public interface usuarioservicio {

    usuario newusuario(usuario newusuario);
    Iterable<usuario> getAll();
    usuario modifyusuario(usuario usuario);
    Boolean deleteusuario(Long idusuario);
}
