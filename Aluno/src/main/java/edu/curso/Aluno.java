package edu.curso;

import java.util.Date;

public class Aluno {
    private long id;
    private Date nascimento;
    private String ra;
    private String nome;

    public void setId(long id) {
        this.id = id;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Id: "+this.id+
                ", nascimento: "+this.nascimento+
                ", ra: "+this.ra+
                ", nome: "+this.nome;
    }

}
