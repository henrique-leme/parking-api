package com.estacionamento.restapi.services;

import java.util.List;
import java.util.Optional;

import com.estacionamento.restapi.exception.EstabelecimentoNotFoundException;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

    public Estabelecimento findById(Integer id) throws EstabelecimentoNotFoundException {
        Estabelecimento foundEstabelecimento = estabelecimentoRepository.findById(id)
                .orElseThrow(() -> new EstabelecimentoNotFoundException(id));
        return foundEstabelecimento;
    }

    public Estabelecimento findByCnpj(String cnpj) throws EstabelecimentoNotFoundException{
        Estabelecimento foundEstabelecimento = estabelecimentoRepository.findByCnpj(cnpj)
                .orElseThrow(() -> new EstabelecimentoNotFoundException(cnpj));
        return foundEstabelecimento;
    }

    public Estabelecimento create(Estabelecimento estabelecimentoModel) {
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

    public void delete(Integer id) throws EstabelecimentoNotFoundException{
       verifyExists(id);
       estabelecimentoRepository.deleteById(id);
    }

    public Estabelecimento update(Estabelecimento estabelecimentoModel, Integer id) throws EstabelecimentoNotFoundException {
        verifyExists(id);
        return estabelecimentoRepository.save(estabelecimentoModel);
    }

       private Estabelecimento verifyExists(Integer id) throws EstabelecimentoNotFoundException {
        return estabelecimentoRepository.findById(id)
                .orElseThrow(() -> new EstabelecimentoNotFoundException(id));
       }
}
