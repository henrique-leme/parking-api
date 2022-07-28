package com.estacionamento.restapi.setup;

import com.estacionamento.restapi.dtos.EstabelecimentoDTO;
import com.estacionamento.restapi.model.Estabelecimento;

public class EstabelecimentoDTOSetup {
    public static EstabelecimentoDTO createValidEstabelecimento() {
        return defaultBuilder().build();
    }



    public static EstabelecimentoDTO.EstabelecimentoDTOBuilder defaultBuilder() {
        return EstabelecimentoDTO.builder()
        .nome("Estabelecimento Teste")
        .cnpj("99999999999999")
        .endereco("Rua de Teste")
        .telefone("99999999999")
        .vagasCarros(0)
        .vagasMotos(0);
    }
}
