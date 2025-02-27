package com.absjunniordev.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Funcionario extends Pessoa{

    private BigDecimal salario;
    private String funcao;

  public  Funcionario(){}

    public Funcionario(String name, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(name, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void aumentarSalario(BigDecimal percentual) {
        this.salario = salario.add(salario.multiply(percentual));
    }

    public void removeFuncionario(String nome, List<Funcionario> list){
        list.removeIf(x -> x.getName().equals(nome));
    }

    @Override
    public
    String toString() {
        return "Nome: " + getName() +
                " | Data Nascimento: " + getDataNascimento() +
                " | Salario: " + String.format("%.2f", salario) +
                " | Funcao: " + funcao  ;
    }
}
