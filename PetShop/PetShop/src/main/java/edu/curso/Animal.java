package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    private int idade;
    private String raca;
    private double peso;
    private List<Consulta> historicoConsultas = new ArrayList<>();

    public void latir(){
        System.out.println("AU AU");
    }

    public void comer(){
        System.out.println("crok crok crok crok");
    }

    public void contrairDoenca(Doenca doenca){
        System.out.println("mmmm mmmmn");
    }
}
