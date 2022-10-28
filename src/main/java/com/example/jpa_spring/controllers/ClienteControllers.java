package com.example.jpa_spring.controllers;

import com.example.jpa_spring.models.dao.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteControllers {

    @Autowired
    private IClienteDao clienteDao;

    @RequestMapping(value = "/listar" ,method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "Lista de clientes");
        model.addAttribute("clientes", clienteDao.findAll());
        return "listar";
    }
}
