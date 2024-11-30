/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.KarbonPollo.api.services;

import com.KarbonPollo.api.model.menu;

/**
 *
 * @author Nico
 */
public interface menuservicio {

    menu newmenu(menu newmenu);
    Iterable<menu> getAll();
    menu modifymenu(menu menu);
    Boolean deletemenu(Long idmenu);
}
