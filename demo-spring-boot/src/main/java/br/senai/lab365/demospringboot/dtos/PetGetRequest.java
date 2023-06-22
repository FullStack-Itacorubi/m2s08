package br.senai.lab365.demospringboot.dtos;

public class PetGetRequest {
    private String especie;
    private String raca;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
