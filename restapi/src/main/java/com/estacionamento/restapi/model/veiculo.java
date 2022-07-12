package com.estacionamento.restapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "veiculos")
public class veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    @Column(nullable = false)
    private List<String> marcas;

    @Column(nullable = false, name = "modelo")
    private String modelo;

    @Column(nullable = false, name = "cor")
    private String cor;

    @Column(nullable = false, name = "placa", unique = true)
    private String placa;

    @ElementCollection
    @Column(nullable = false)
    private List<String> tipo;

    public veiculo() {
    }

    public veiculo(int id, List<String> marcas, String modelo, String cor, String placa, List<String> tipo) {
        this.id = id;
        this.marcas = marcas;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(List<String> tipo) {
        this.tipo = tipo;
    }
}
