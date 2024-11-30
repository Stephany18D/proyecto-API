/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KarbonPollo.api.controller;

import com.KarbonPollo.api.model.menu;
import com.KarbonPollo.api.services.menuservicio;
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
@RequestMapping("/menu")
public class menucontroller {

    @Autowired
    private menuservicio Menuservicio;

    @PostMapping("/nuevo")
    public menu newMenu(@RequestBody menu newmenu) {
        return this.Menuservicio.newmenu(newmenu);
    }

    @GetMapping("/mostrar")
    public Iterable<menu> getAll() {
        return Menuservicio.getAll();
    }

    @PostMapping("/modificar")
    public menu updateMenu(@RequestBody menu Menu) {
        return this.Menuservicio.modifymenu(Menu);
    }

    @PostMapping(value="/{id}")
    public Boolean deleteMenu(@PathVariable(value="id") Long id) {
        return this.Menuservicio.deletemenu(id);
    }
}
