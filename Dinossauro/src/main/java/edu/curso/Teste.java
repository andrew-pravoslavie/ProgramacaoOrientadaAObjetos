package edu.curso;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Dinossauro skeep = new Dinossauro(10, 0, 5, 10);
        Scanner scan = new Scanner(System.in);

        while(true){
            for(int i=0;i<20;i++){
                System.out.println();
            }
            skeep.obterStatus();
            menuOpcoes();
            String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);
            switch(letra){
                case 'P' -> skeep.pular();
                case 'C' -> skeep.correr();
                case 'M' -> skeep.comer();
                case 'A' -> skeep.cantar();
                case 'S' -> skeep.tomarSol();
                case 'O' -> skeep.ficarNaSombra();
            }
        }
    }
    public static void menuOpcoes(){
        System.out.println("Decisão do Skeep:");
        System.out.println("(P)ular | (C)orrer | Co(M)er | C(A)ntar | Tomar (S)ol | Ficar na S(O)mbra");
        System.out.print("$: ");
    }
}
