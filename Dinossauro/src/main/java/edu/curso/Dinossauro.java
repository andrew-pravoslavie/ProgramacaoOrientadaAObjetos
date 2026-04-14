package edu.curso;

public class Dinossauro {
    public int energia;
    public int velocidade;
    public int temperatura;
    public int humor;

    public Dinossauro(int energia, int velocidade, int temperatura, int humor) {
        this.energia = energia;
        this.velocidade = velocidade;
        this.temperatura = temperatura;
        this.humor = humor;
    }

    public void pular(){
        this.energia = this.energia - 2;
        checarStatus();
    }

    public void correr(){
        this.energia = this.energia - 2;
        this.velocidade = this.velocidade - 2;
        this.humor = this.humor + 3;
        checarStatus();
    }

    public void comer(){
        this.energia = this.energia + 3;
        this.velocidade = this.velocidade - 2;
        this.humor = this.humor + 3;
        checarStatus();
    }

    public void cantar(){
        this.energia = this.energia - 2;
        this.humor = this.humor + 3;
        checarStatus();
    }

    public void tomarSol(){
        this.velocidade = this.velocidade + 3;
        this.temperatura = this.temperatura + 3;
        this.humor = this.humor + 3;
        checarStatus();
    }

    public void ficarNaSombra(){
        this.energia = this.energia + 3;
        this.humor = this.humor - 2;
        this.temperatura = this.temperatura - 3;
        checarStatus();
    }

    public void obterStatus(){
        System.out.println("Saúde do Skeep:");
        System.out.print("Energia: "+this.energia+
                " | Velocidade: "+this.velocidade+
                " | Temperatura: "+this.temperatura+
                " | Humor: "+this.humor);
        System.out.println();
    }

    private void checarStatus(){
        if(this.energia <= 0){
            System.out.println("Skeep ficou muito cansado, Skeep vai dormir.");
            System.exit(0);
        }
        if(this.velocidade <= 3){
            System.out.println("Skeep quer correr, Skeep quer velocidade!");
        }
        if(this.temperatura >= 10){
            System.out.println("Skeep está fervendo, Skeep não aguenta mais...");
            System.exit(0);
        }
        if(this.temperatura <= 0){
            System.out.println("Skeep está congelando, Skeep não nasceu pra viver no Alaska...");
            System.exit(0);
        }
        if(this.humor <= 3){
            System.out.println("Skeep quer fazer algo divertido, Skeep não se aguenta mais de tédio.");
        }
        // Limitadores
        if(this.energia > 10){this.energia=10;}
        if(this.velocidade < 0){this.velocidade = 0;}
        if(this.velocidade > 10){this.velocidade = 10;}
        if(this.humor < 0){this.humor = 0;}
        if(this.humor > 10){this.humor = 10;}
    }
}