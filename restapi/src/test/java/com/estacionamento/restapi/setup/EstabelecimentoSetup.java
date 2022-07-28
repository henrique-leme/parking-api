package com.estacionamento.restapi.setup;

import com.estacionamento.restapi.model.Estabelecimento;

public class EstabelecimentoSetup {
    public static Estabelecimento createValidEstabelecimento() {
        return defaultBuilder().build();
    }

    public static Estabelecimento updateValidEstabelecimento() {
        return defaultBuilder().id(1)
        .nome("Estabelecimento Teste 2")
        .build();
    }

    public static Estabelecimento.EstabelecimentoBuilder defaultBuilder() {
        return Estabelecimento.builder().id(1)
        .nome("Estabelecimento Teste")
        .cnpj("99999999999999")
        .endereco("Rua de Teste")
        .telefone("99999999999")
        .vagasCarros(0)
        .vagasMotos(0);
    }
}
