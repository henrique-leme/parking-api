package com.estacionamento.restapi.controller;

import com.estacionamento.restapi.dtos.EstabelecimentoDTO;
import com.estacionamento.restapi.dtos.VeiculoDTO;
import com.estacionamento.restapi.exception.NotFoundException;
import com.estacionamento.restapi.model.Estabelecimento;
import com.estacionamento.restapi.model.Veiculo;
import com.estacionamento.restapi.services.VeiculoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    //Lista todos os veiculos
    @GetMapping
    public ResponseEntity<List<Veiculo>> findAllVeiculos() {
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.findAll());
    }

    //Busca um Veiculo pelo id
    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findVeiculoById(@PathVariable(value = "id") Integer id) throws NotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.findById(id));
    }

    @GetMapping(path = "/placa/{placa}")
    public ResponseEntity<Object> findVeiculoByPlaca(@PathVariable(value = "placa")String placa)throws NotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.findByPlaca(placa));
    }

    @PostMapping
    public ResponseEntity<Object> createVeiculo(@Valid @RequestBody VeiculoDTO veiculoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoService.create(veiculoDTO));
    }
@DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteVeiculo(@PathVariable(value = "id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.delete(id));
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> updateVeiculo(@RequestBody @Valid VeiculoDTO veiculoDTO,
                                                        @PathVariable(value = "id") Integer id) throws NotFoundException {
        //Recebe o veiculo existente
        Veiculo veiculoExists = veiculoService.findById(id);

        //Faz o veiculo existente copiar os dados fornecidos
        BeanUtils.copyProperties(veiculoDTO, veiculoExists);
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.update(veiculoExists, id));
    }
}
