package com.estacionamento.restapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.restapi.model.estabelecimento;
import com.estacionamento.restapi.repository.EstabelecimentoRepository;


@Service
public class EstabelecimentoService {

    //Injecao de Dependencia
    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    //Metodos Service

    public List<estabelecimento> findAll() {
        return estabelecimentoRepository.findAll();
    }

    public Optional<estabelecimento> findById(Integer id) {
        return estabelecimentoRepository.findById(id); 
    }

    @Transactional
    public estabelecimento create(estabelecimento estabelecimentoModel) {
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

    @Transactional
    public void delete(estabelecimento estabelecimento) {
        estabelecimentoRepository.delete(estabelecimento);
    }

    public estabelecimento update(estabelecimento estabelecimentoModel) {
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

       
}
