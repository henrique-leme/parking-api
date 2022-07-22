package com.estacionamento.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.estacionamento.restapi.model.estabelecimento;
import com.estacionamento.restapi.services.EstabelecimentoService;


@RestController
@RequestMapping(path = "/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    //Lista todos os Estabelecimentos
    @GetMapping
    public List<estabelecimento> findAll() {
        return estabelecimentoService.findAll();
    }

    //Busca um Estabelecimento pelo id
    @GetMapping(path = "/{id}")
    public estabelecimento findById(@PathVariable Integer id) {
        return estabelecimentoService.findById(id);
    }

    // Cria um novo Estabelecimento
    @PostMapping
    public estabelecimento create(@RequestBody estabelecimento estabelecimento) { 
        return estabelecimentoService.create(estabelecimento);
    }

    //Deleta um Estabelecimento
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Integer id) {
        estabelecimentoService.delete(id);
    }

    // Atualiza um Estabelecimento
    @PutMapping(path = "/{id}")
    public estabelecimento update(@RequestBody estabelecimento Estabelecimento, @PathVariable Integer id) {
        return estabelecimentoService.update(Estabelecimento, id);
    }
}
    


