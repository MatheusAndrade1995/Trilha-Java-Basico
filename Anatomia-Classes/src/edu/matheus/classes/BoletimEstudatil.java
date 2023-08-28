package edu.matheus.classes;
public class BoletimEstudatil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova de Minerva");
        else if (mediaFinal == 7) 
            System.out.println("Aprovado em média");
        else
        System.out.println("Aprovado com sucesso");
    }
}
