package com.estacionamento.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.restapi.model.Estabelecimento;
import com.estacionamento.restapi.repository.EstabelecimentoRepository;


@Service
public class EstabelecimentoService {

    //Injecao de Dependencia
    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    //Metodos Service

    public List<Estabelecimento> findAll() {
        return estabelecimentoRepository.findAll();
    }

    public Optional<Estabelecimento> findById(Integer id) {

        return estabelecimentoRepository.findById(id); 
    }


    public Estabelecimento create(Estabelecimento estabelecimentoModel) {
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

    public void delete(Estabelecimento estabelecimento) {
        estabelecimentoRepository.delete(estabelecimento);
    }

    public Estabelecimento update(Estabelecimento estabelecimentoModel) {
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

       
}
