package edu.curso;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class GestaoAlunos {
    private int indice;
    private Aluno[] alunos = new Aluno[50];
    private Scanner sc = new Scanner(System.in);

    public void criar(){
        sc.nextLine();

        if(indice == 49){
            System.out.println("Matriz cheia, não é possível criar novos alunos");
            return;
        }

        Aluno aluno = new Aluno();

        System.out.println("Insira o nome do aluno");
        System.out.print("$ ");
        aluno.setNome(sc.nextLine());

        System.out.println("Insira o id do aluno");
        System.out.print("$ ");
        aluno.setId(sc.nextLong());


        System.out.println("Insira o ra do aluno");
        System.out.print("$ ");
        aluno.setRa(sc.next());

        System.out.println("Insira a data do cadastro (dd/MM/yyyy):");
        System.out.print("$ ");
        try {
            aluno.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
            alunos[indice] = aluno;
            indice++;
        }catch(Exception e){
            System.out.println("Formato de data não reconhecido, tente novamente.");
        }

    }

    public void atualizar(){

        System.out.println("Digite o número do RA do aluno que deseja atualizar:");
        System.out.print("$ ");
        String ra = sc.next();
        sc.nextLine();

        for(int i=0;i<indice;i++){
            if(alunos[i] != null){
                String raAluno = alunos[i].getRa();
                if(raAluno.equals(ra)){
                    Aluno aluno = new Aluno();
                    aluno = alunos[i];
                    System.out.println("Aluno encontrado, digite o nome atualizado do aluno:");
                    System.out.print("$ ");
                    alunos[i].setNome(sc.nextLine());

                    System.out.println("Digite a data de nascimento do aluno (dd/MM/yyyy):");
                    System.out.print("$ ");
                    try {
                        alunos[i].setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()));
                        alunos[i] = aluno;
                        System.out.println("Dados atualizados com sucesso");
                    }catch(Exception e){
                        System.out.println("Formato de data não reconhecido, tente novamente.");
                    }
                    return;
                }
            }
        }

        System.out.println("RA não encontrado, tente novamente.");

    }

    public void excluir(){

        System.out.println("Digite o número do RA do aluno que deseja excluir:");
        System.out.print("$ ");
        String ra = sc.next();

        for(int i=0;i<indice;i++){
            if(alunos[i] != null){
                String raAluno = alunos[i].getRa();
                if(raAluno.equals(ra)){
                    alunos[i] = null;
                    indice--;
                    System.out.println("Aluno excluído com sucesso!");
                    return;
                }
            }
        }

        System.out.println("Aluno não localizado, tente novamente.");

    }

    public void exibir(){

        System.out.println("Digite o número do RA");
        System.out.print("$ ");
        String ra = sc.next();

        for(int i=0;i<indice;i++){
            if(alunos[i] != null){
                String raAluno = alunos[i].getRa();
                if(raAluno.equals(ra)){
                    System.out.println("Aluno localizado:"+alunos[i].toString());
                    return;
                }
            }
        }
        System.out.println("Aluno não localizado.");


    }

    public void menu(){

        while(true){
            System.out.println("Escolha uma opção:");
            System.out.println("(C)riar | (E)xibir | (R)emover | (A)tualizar | (S)air");
            System.out.print("$ ");
            String opc = sc.next().toUpperCase();
            char letra = opc.charAt(0);
            switch(letra){
                case 'C' -> criar();
                case 'E' -> exibir();
                case 'R' -> excluir();
                case 'A' -> atualizar();
                case 'S' -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }

    }

}
