package com.estacionamento.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estacionamento.restapi.model.veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<veiculo, Integer>{
    
}
