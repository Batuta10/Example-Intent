package br.com.fiap.exemplodeintent;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private  boolean deficiente;


    private Double salario;

    //Getter and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getSalario() { return salario; }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isdeficiente() {
        return deficiente;
    }

    public void setDeficiencia(boolean deficiente) {
        this.deficiente = deficiente;
    }
}//Class