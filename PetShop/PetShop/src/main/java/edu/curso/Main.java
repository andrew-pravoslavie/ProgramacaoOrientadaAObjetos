package edu.curso;

public class Main {
    public static void main(String[] args) {
        Dono andrew = new Dono();
        Dono antonio = new Dono();
        Animal cachorro = new Animal();
        Animal gato = new Animal();
        Veterinario vet1 = new Veterinario();
        Veterinario vet2 = new Veterinario();
        Doenca sarna = new Doenca();
        Doenca cancerRenal = new Doenca();

        andrew.adotarAnimal(cachorro);
        antonio.adotarAnimal(gato);

        cachorro.contrairDoenca(sarna);
        gato.contrairDoenca(cancerRenal);

        andrew.irAoVeterinario();
        Consulta consulta1 = andrew.abrirConsulta(cachorro, sarna);

        vet1.iniciarAtendimento(consulta1);
        vet1.darAlta(consulta1);

        antonio.irAoVeterinario();
        Consulta consulta2 = antonio.abrirConsulta(gato, cancerRenal);

        vet2.iniciarAtendimento(consulta2);
        vet2.darAlta(consulta2);
    }
}
