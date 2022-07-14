package com.estacionamento.restapi.model;

import javax.persistence.*;

@Entity
@Table(name = "Estabelecimentos")
public class estabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @Column(nullable = false, name = "cnpj", unique = true, length = 13)
    private String cnpj;

    @Column(nullable = false, name = "endereco")
    private String endereco;

    @Column(nullable = false, name = "telefone", unique = true, length = 10)
    private String telefone;

    @Column(nullable = false, name = "vagas_motos")
    private String vagas_motos;

    @Column(nullable = false, name = "vagas_carros")
    private String vagas_carros;

    public estabelecimento() {
    }

    public estabelecimento(String nome, String cnpj, String endereco, String telefone, String vagas_motos, String vagas_carros) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vagas_motos = vagas_motos;
        this.vagas_carros = vagas_carros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getVagas_motos() {
        return vagas_motos;
    }

    public void setVagas_motos(String vagas_motos) {
        this.vagas_motos = vagas_motos;
    }

    public String getVagas_carros() {
        return vagas_carros;
    }

    public void setVagas_carros(String vagas_carros) {
        this.vagas_carros = vagas_carros;
    }
}
