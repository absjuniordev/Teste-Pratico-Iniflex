package com.absjunniordev.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String name;
    private LocalDate dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String name, LocalDate dataNascimento) {
        this.name = name;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
