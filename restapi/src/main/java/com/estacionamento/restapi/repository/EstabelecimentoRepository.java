package com.estacionamento.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estacionamento.restapi.model.estabelecimento;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<estabelecimento, Integer>{
    
}
