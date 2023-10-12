package Modulo2;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o cofre que deseja acessar?");
        String tipoCofre = scanner.nextLine();
        Cofre cofre = null;

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            cofre = new CofreDigital(0);
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
            int confirmaSenha = scanner.nextInt();
            if (cofreDigital.validarSenha(confirmaSenha)) {
                cofre.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {   
            cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }
        scanner.close();
    }
}