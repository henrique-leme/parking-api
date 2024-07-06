package com.estacionamento.restapi.controller;


import com.estacionamento.restapi.dtos.EstabelecimentoDTO;
import com.estacionamento.restapi.model.Estabelecimento;
import com.estacionamento.restapi.services.EstabelecimentoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "/estabelecimento")
@CrossOrigin(origins = "*")
@Api(value = "API Rest Estacionamento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @Autowired
    private ModelMapper modelMapper;

    //Lista todos os Estabelecimentos
    @GetMapping
    @ApiOperation(value = "Essa rota é responsavel por Listar todos os Estabelecimentos")
    public ResponseEntity<List<EstabelecimentoDTO>> findAllEstabelecimento() {
        List<EstabelecimentoDTO> body
                = estabelecimentoService
                .findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, EstabelecimentoDTO.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(body);
    }

    //Busca um Estabelecimento pelo id
    @GetMapping(path = "/{id}")
    @ApiOperation(value = "Essa rota é responsavel por buscar um Estabelecimento pelo id")
    public ResponseEntity<EstabelecimentoDTO> findEstabelecimentoById(@PathVariable(value = "id") Integer id) {
        var estabelecimento = estabelecimentoService.findById(id);
        var body = modelMapper.map(estabelecimento, EstabelecimentoDTO.class);

        return ResponseEntity.ok(body);
    }

    //Busca um Estabelecimento pelo CNPJ
    @GetMapping(path = "/cnpj/{cnpj}")
    @ApiOperation(value = "Essa rota é responsavel por buscar um Estabelecimento por CNPJ ")
    public ResponseEntity<EstabelecimentoDTO> findEstabelecimentoByCNPJ(@PathVariable(value = "cnpj")String cnpj){
        var estabelecimento = estabelecimentoService.findByCnpj(cnpj);
        var body = modelMapper.map(estabelecimento, EstabelecimentoDTO.class);

        return ResponseEntity.ok(body);
    }

    // Cria um novo Estabelecimento
    @PostMapping
    @ApiOperation(value = "Essa rota é responsavel por criar um Estabelecimento")
    public ResponseEntity<EstabelecimentoDTO> createEstabelecimento(@RequestBody @Valid EstabelecimentoDTO estabelecimentoDTO) {
        var estabelecimento = estabelecimentoService.create(modelMapper.map(estabelecimentoDTO, Estabelecimento.class));

        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(estabelecimento, EstabelecimentoDTO.class));
    }

    //Deleta um Estabelecimento
    @DeleteMapping(path = "/{id}")
    @ApiOperation(value = "Essa rota é responsavel por deletar um Estabelecimento")
    public ResponseEntity<Void> deleteEstabelecimento(@PathVariable(value = "id") Integer id) {
        estabelecimentoService.delete(id);

        return ResponseEntity.noContent().build();
    }

    // Atualiza um Estabelecimento
    @PutMapping(path = "/{id}")
    @ApiOperation(value = "Essa rota é responsavel por atualizar um Estabelecimento")
    public ResponseEntity<EstabelecimentoDTO> updateEstabelecimento(@RequestBody @Valid EstabelecimentoDTO dto,
                                                                    @PathVariable(value = "id") Integer id)  {
        dto.setId(id);

        var estabelecimento = estabelecimentoService.update(modelMapper.map(dto, Estabelecimento.class));
        return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(estabelecimento, EstabelecimentoDTO.class));
    }
}




