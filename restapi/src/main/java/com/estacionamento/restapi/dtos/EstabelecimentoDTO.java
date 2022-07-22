package com.estacionamento.restapi.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EstabelecimentoDTO {
   
    @NotBlank   
    private String nome;
    
    @NotBlank
    @Size(min = 14, max = 14)
    @Pattern(regexp = "^[0-9]*")
    private String cnpj;

    @NotBlank   
    private String endereco;

    @NotBlank
    @Size(min = 11, max = 11)
    @Pattern(regexp = "^[0-9]*")
    private String telefone;
    
    @NotNull
    private int vagasCarros;
    
    @NotNull
    private int vagasMotos;
}
