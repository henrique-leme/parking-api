package com.estacionamento.restapi.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estacionamento.restapi.dtos.EstabelecimentoDTO;
import com.estacionamento.restapi.model.estabelecimento;
import com.estacionamento.restapi.services.EstabelecimentoService;


@RestController
@RequestMapping(path = "/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    //Lista todos os Estabelecimentos
    @GetMapping
    public ResponseEntity<List<estabelecimento>> findAllEstabelecimento() {
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoService.findAll());
    }

    //Busca um Estabelecimento pelo id
    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") Integer id) {
        Optional<estabelecimento> estabelecimentoExists = estabelecimentoService.findById(id);
        if(!estabelecimentoExists.isPresent()){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado"); 
        }
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoExists.get());
    }

    // Cria um novo Estabelecimento
    @PostMapping
    public ResponseEntity<Object> createEstabelecimento(@RequestBody @Valid EstabelecimentoDTO estabelecimentoDTO) { 
        var estabelecimentoModel = new estabelecimento();
        BeanUtils.copyProperties(estabelecimentoDTO, estabelecimentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(estabelecimentoService.create(estabelecimentoModel));
        
    }

    //Deleta um Estabelecimento
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> deleteEstabelecimento(@PathVariable(value = "id") Integer id) {
        Optional<estabelecimento> estabelecimentoExists = estabelecimentoService.findById(id);
        if(!estabelecimentoExists.isPresent()){
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado"); 
        }
        estabelecimentoService.delete(estabelecimentoExists.get());
        return ResponseEntity.status(HttpStatus.OK).body("Estabelecimento deletado com sucesso");
    }

    // Atualiza um Estabelecimento
    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> updateEstabelecimento(@RequestBody @Valid EstabelecimentoDTO estabelecimentoDTO, 
                                                        @PathVariable(value = "id") Integer id) {
        Optional<estabelecimento> estabelecimentoExists = estabelecimentoService.findById(id);
        if(!estabelecimentoExists.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não encontrado");
        }
        // Recebe o estabelecimento existente
        var estabelecimentoModel = estabelecimentoExists.get();
        //Recebe os dados
        BeanUtils.copyProperties(estabelecimentoDTO, estabelecimentoModel);       
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoService.update(estabelecimentoModel));                                                   
    }
}
    


