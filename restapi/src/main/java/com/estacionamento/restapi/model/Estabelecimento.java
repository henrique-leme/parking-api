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

    @Column(nullable = false, name = "vagasMotos")
    private int vagasMotos;

    @Column(nullable = false, name = "vagasCarros")
    private int vagasCarros;

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
            int vagasMotos, 
            int vagasCarros, 
            int numeroDeCarrosEstacionados, 
            int numeroDeMotosEstacionados
            ) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vagasMotos = vagasMotos;
        this.vagasCarros = vagasCarros;
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

    public int getVagasMotos() {
        return vagasMotos;
    }

    public void setVagasMotos(int vagasMotos) {
        this.vagasMotos = vagasMotos;
    }

    public int getVagasCarros() {
        return vagasCarros;
    }

    public void setVagasCarros(int vagasCarros) {
        this.vagasCarros = vagasCarros;
    }
}
