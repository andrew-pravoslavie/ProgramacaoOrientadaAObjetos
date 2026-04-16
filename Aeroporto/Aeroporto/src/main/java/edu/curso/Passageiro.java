package edu.curso;

import java.util.Date;

public class Passageiro {

    private String numeroPassaporte;
    private String nome;
    private Date dataVoo;
    private String assento;
    private String statusEmbarque;

    public void embarcar(Aeronave aviao){
        System.out.println("Passageiro embarcou em "+aviao.getNome());
    }

}
