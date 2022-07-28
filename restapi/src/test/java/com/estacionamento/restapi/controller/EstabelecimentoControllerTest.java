package com.estacionamento.restapi.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.estacionamento.restapi.setup.EstabelecimentoDTOSetup;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.estacionamento.restapi.model.Estabelecimento;
import com.estacionamento.restapi.services.EstabelecimentoService;
import com.estacionamento.restapi.setup.EstabelecimentoSetup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.Id;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class EstabelecimentoControllerTest {

    @InjectMocks
    private EstabelecimentoController estabelecimentoController;

    @Mock
    private EstabelecimentoService estabelecimentoService;

    private static final Estabelecimento VALID_ESTABELECIMENTO = EstabelecimentoSetup.createValidEstabelecimento();

    @BeforeEach
    void setUp() {
        when(estabelecimentoService.create(ArgumentMatchers.any(Estabelecimento.class))).thenReturn(VALID_ESTABELECIMENTO);
        when(estabelecimentoService.findAll()).thenReturn(List.of(VALID_ESTABELECIMENTO));
        when(estabelecimentoService.findById(ArgumentMatchers.anyInt())).thenReturn(Optional.of(VALID_ESTABELECIMENTO));
    }

    @Test
    void create_saveEstabelecimento_WhenSuccessful() {

        ResponseEntity<Object> estabelecimentoEntity = estabelecimentoController.createEstabelecimento(EstabelecimentoDTOSetup.createValidEstabelecimento());
        Estabelecimento body = (Estabelecimento) estabelecimentoEntity.getBody();

        Assertions.assertThat(estabelecimentoEntity).isNotNull();
        Assertions.assertThat(body).isNotNull();
        Assertions.assertThat(estabelecimentoEntity.getStatusCode()).isNotNull().isEqualTo(HttpStatus.CREATED);

        assertEstabelecimentoFields(body);
    }


    @Test
    void listAll_returnListofEstabelecimentos_WhenSucessful() {
        ResponseEntity<List<Estabelecimento>> estabelecimentosEntity = estabelecimentoController.findAllEstabelecimento();
        List<Estabelecimento> body = estabelecimentosEntity.getBody();

        Assertions.assertThat(estabelecimentosEntity).isNotNull();
        Assertions.assertThat(body).isNotNull().isNotEmpty().hasSize(1).contains(VALID_ESTABELECIMENTO);
        Assertions.assertThat(estabelecimentosEntity.getStatusCode()).isNotNull().isEqualTo(HttpStatus.OK);
    }

    @Test
    void listAll_returnEmptyListofEstabelecimentos_WhenSucessful() {
        when(estabelecimentoService.findAll()).thenReturn(Collections.emptyList());
        ResponseEntity<List<Estabelecimento>> estabelecimentosEntity = estabelecimentoController.findAllEstabelecimento();
        List<Estabelecimento> body = estabelecimentosEntity.getBody();

        Assertions.assertThat(estabelecimentosEntity).isNotNull();
        Assertions.assertThat(body).isNotNull().isEmpty();
        Assertions.assertThat(estabelecimentosEntity.getStatusCode()).isNotNull().isEqualTo(HttpStatus.OK);
    }

    private void assertEstabelecimentoFields(Estabelecimento estabelecimento) {
        Assertions.assertThat(estabelecimento.getNome()).isNotNull().isNotEmpty();
        Assertions.assertThat(estabelecimento.getCnpj()).isNotNull().isNotEmpty();
        Assertions.assertThat(estabelecimento.getEndereco()).isNotNull().isNotEmpty();
        Assertions.assertThat(estabelecimento.getTelefone()).isNotNull().isNotEmpty();
    }
}
