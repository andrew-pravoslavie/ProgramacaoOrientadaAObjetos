package edu.curso;

public class Aeroporto {

    private int codigo;
    private String nome;
    private int numeroAvioes;
    private int numeroPortoes;
    private int pistas;

    public void registrarChegadaAviao(Aeronave aviao){
        System.out.println(aviao.getNome()+" acabou de chegar em "+this.nome);
    }

    public void registrarSaidaAviao(Aeronave aviao){
        System.out.println(aviao.getNome()+" acabou de sair"+this.nome);

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

}
