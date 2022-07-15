package com.estacionamento.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estacionamento.restapi.model.estabelecimento;
import com.estacionamento.restapi.repository.EstabelecimentoRepository;


@Service
public class EstabelecimentoService {

    @Autowired
    EstabelecimentoRepository estabelecimentoRepository;

    public List<estabelecimento> findAll() {
        return estabelecimentoRepository.findAll();
    }

    public estabelecimento findById(Integer id) {
        Optional<estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);      
        if (estabelecimento.isPresent()); {
            return estabelecimento.get();
       } 
    }

    public estabelecimento create(estabelecimento estabelecimento) {   
        return estabelecimentoRepository.save(estabelecimento);
    }

    public void delete(Integer id) {
        estabelecimentoRepository.deleteById(id);
    }

    
}
