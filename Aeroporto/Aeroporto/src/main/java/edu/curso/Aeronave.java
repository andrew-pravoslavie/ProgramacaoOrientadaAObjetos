package edu.curso;

public class Aeronave {

    private String modelo;
    private String numeroSerie;
    private int capacidadePassageiros;
    private Piloto piloto;
    private String statusOperacional;

    public Aeronave(String modelo, String numeroSerie, int capacidadePassageiros, String statusOperacional) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.capacidadePassageiros = capacidadePassageiros;
        this.statusOperacional = statusOperacional;
    }

    public void decolar(){
        System.out.println(this.modelo+": Decolando! Para os ares!");
    }

    public void pousar(Aeroporto aeroporto){
        System.out.println(this.modelo+": Pousando aeronave no "+aeroporto.getNome());
    }

    public String getNome(){
        return this.modelo;
    }

    public void setPiloto(Piloto piloto){
        System.out.println("Piloto "+piloto.getNome()+" acaba de embarcar no "+this.modelo);
    }

}
