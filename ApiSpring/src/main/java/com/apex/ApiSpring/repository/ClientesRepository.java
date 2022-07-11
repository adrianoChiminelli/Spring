package com.apex.ApiSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apex.ApiSpring.model.ClientesModel;

public interface ClientesRepository extends JpaRepository<ClientesModel, Integer> {



}
