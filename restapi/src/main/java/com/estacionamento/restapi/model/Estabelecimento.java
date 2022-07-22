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

    @Column(nullable = false, name = "cnpj", unique = true, length = 14)
    private String cnpj;

    @Column(nullable = false, name = "endereco")
    private String endereco;

    @Column(nullable = false, name = "telefone", unique = true, length = 11)
    private String telefone;

    @Column(nullable = false)
    private int vagas_motos;

    @Column(nullable = false)
    private int vagas_carros;

    @Column(nullable = false)
    private int numeroDeCarrosEstacionados;

    @Column(nullable = false)
    private int numeroDeMotosEstacionados;

    public estabelecimento() {
    }

    public estabelecimento(String nome,
            String cnpj,
            String endereco,
            String telefone,
            int vagas_motos, 
            int vagas_carros, 
            int numeroDeCarrosEstacionados, 
            int numeroDeMotosEstacionados
            ) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vagas_motos = vagas_motos;
        this.vagas_carros = vagas_carros;
        this.numeroDeCarrosEstacionados = numeroDeCarrosEstacionados;
        this.numeroDeMotosEstacionados = numeroDeMotosEstacionados;
    }

    public int getNumeroDeCarrosEstacionados() {
        return numeroDeCarrosEstacionados;
    }

    public void setNumeroDeCarrosEstacionados(int numeroDeCarrosEstacionados) {
        this.numeroDeCarrosEstacionados = numeroDeCarrosEstacionados;
    }

    public int getNumeroDeMotosEstacionados() {
        return numeroDeMotosEstacionados;
    }

    public void setNumeroDeMotosEstacionados(int numeroDeMotosEstacionados) {
        this.numeroDeMotosEstacionados = numeroDeMotosEstacionados;
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

    public int getVagas_motos() {
        return vagas_motos;
    }

    public void setVagas_motos(int vagas_motos) {
        this.vagas_motos = vagas_motos;
    }

    public int getVagas_carros() {
        return vagas_carros;
    }

    public void setVagas_carros(int vagas_carros) {
        this.vagas_carros = vagas_carros;
    }
}
