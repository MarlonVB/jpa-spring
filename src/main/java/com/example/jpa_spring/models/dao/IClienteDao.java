package com.example.jpa_spring.models.dao;

import com.example.jpa_spring.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {
    public List<Cliente> findAll();
}
