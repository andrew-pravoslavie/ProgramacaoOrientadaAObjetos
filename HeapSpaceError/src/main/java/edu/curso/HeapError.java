package edu.curso;

import java.util.ArrayList;
import java.util.List;

class HeapError{
    public static void main(String[] args){
        List<double[]> lista = new ArrayList<>();
        try{
            while(true){
                lista.add(new double[25*04*1453]);
            }
        }catch(OutOfMemoryError e){
            System.out.println("Erro concluído com sucesso! :)");
            System.out.print(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}