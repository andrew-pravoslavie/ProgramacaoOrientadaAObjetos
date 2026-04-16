package edu.curso;

public class Main {
    public static void main(String[] args) {
        // Instâncias
        Aeronave aviao1 = new Aeronave("Boeing 747", "747", 500, "Convertido");
        Aeronave caca1 = new Aeronave("F-39EGripen", "12304", 1, "Ativo");
        Piloto andrew = new Piloto("Andrew");
        Piloto antonio = new Piloto("Antonio");
        Passageiro pass1 = new Passageiro();
        Passageiro pass2 = new Passageiro();
        Aeroporto gru = new Aeroporto();
        Aeroporto congonhas = new Aeroporto();
        //

        gru.setNome("GRU - Aeroporto de Guarulhos");
        congonhas.setNome("Aeroporto de Congonhas");

        aviao1.decolar();
        caca1.decolar();

        aviao1.pousar(gru);
        gru.registrarChegadaAviao(aviao1);

        caca1.pousar(congonhas);
        congonhas.registrarChegadaAviao(caca1);

        andrew.embarcar(caca1);
        antonio.embarcar(aviao1);

        pass1.embarcar(aviao1);
        pass2.embarcar(aviao1);

        aviao1.decolar();
        caca1.decolar();

    }
}
