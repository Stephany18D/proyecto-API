/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.menu;
import com.KarbonPollo.api.repository.menuinterface;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico
 */
@Service
public class menuservicioimple implements menuservicio {

    @Autowired
    private menuinterface Menuinterface;

    @Override
    public menu newmenu(menu newmenu) {
        return Menuinterface.save(newmenu);
    }

    @Override
    public Iterable<menu> getAll() {
        return this.Menuinterface.findAll();
    }

    @Override
    public menu modifymenu(menu menu) {
        Optional<menu> menuEncontrado = this.Menuinterface.findById(menu.getIdmenu());
        if (menuEncontrado.get() != null) {
            menuEncontrado.get().setNombrePlatillo(menu.getNombrePlatillo());
            menuEncontrado.get().setDescripcion(menu.getDescripcion());
            menuEncontrado.get().setPrecio(menu.getPrecio());
            return this.newmenu(menuEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deletemenu(Long idmenu) {
        this.Menuinterface.deleteById(idmenu);
        return true;
    }
}
