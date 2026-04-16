package edu.curso;

public class Piloto {

    private String cpf;
    private String nome;
    private double horasVoo;
    private String licenca;
    private String designacao;

    public Piloto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void embarcar(Aeronave aviao){
        System.out.println(this.nome+" acabou de embarcar em "+aviao.getNome());
    }
}
