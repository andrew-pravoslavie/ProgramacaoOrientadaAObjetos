package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nome;
    private String crmv;
    private String especialidade;
    private int mesesExperiencia;
    private List<Consulta> historicoConsultas = new ArrayList<>();

    public void iniciarAtendimento(Consulta consulta){
        System.out.println("Vou cuidar do seu pet");
    }

    public void darAlta(Consulta consulta){
        System.out.println("Pode levar ele para casa");
    }
}
