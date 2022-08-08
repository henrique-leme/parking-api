package com.estacionamento.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EstabelecimentoNotFoundException extends Exception{
    public EstabelecimentoNotFoundException(Integer id) {
        super(String.format("Estabelecimento com id %s não foi encontrado", id));
    }
}
