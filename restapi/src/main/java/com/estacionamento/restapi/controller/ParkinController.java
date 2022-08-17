package com.estacionamento.restapi.controller;

import com.estacionamento.restapi.services.ParkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/estabelecimento")
public class ParkinController {

    @Autowired
    private ParkinService parkinService;

    @PostMapping(path = "/{estabelecimento}/entrada/{veiculo}")
    public ResponseEntity<String> entradaDeVeiculo(@PathVariable Integer estabelecimento,
                                                   @PathVariable Integer veiculo) {
        return ResponseEntity.status(HttpStatus.OK).body(parkinService.entrada(estabelecimento, veiculo));
    }

    @PostMapping(path = "/{estabelecimento}/saida/{veiculo}")
    public ResponseEntity<String> saidaDeVeiculo(@PathVariable Integer estabelecimento,
                                                   @PathVariable Integer veiculo) {
        return ResponseEntity.status(HttpStatus.OK).body(parkinService.saida(estabelecimento, veiculo));
    }
}
