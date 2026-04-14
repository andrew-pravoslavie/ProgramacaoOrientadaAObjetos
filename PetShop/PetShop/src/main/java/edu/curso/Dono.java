package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Dono {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Animal> animaisEstimacao = new ArrayList<>();
    private List<Consulta> historicoConsultas = new ArrayList<>();

    public void irAoVeterinario(){
        System.out.println("Oi, meu pet está mal, quero abrir uma consulta");
    }
    public Consulta abrirConsulta(Animal animal, Doenca doenca){
        Consulta consulta = new Consulta();
        this.historicoConsultas.add(consulta);
        return consulta;
    }
    public void adotarAnimal(Animal animal){
        animaisEstimacao.add(animal);
    }
}
