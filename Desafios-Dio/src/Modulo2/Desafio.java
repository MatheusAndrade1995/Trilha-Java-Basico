package Modulo2;

import java.util.Scanner;


public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Informacoes: \r\n" +
                "Conta: " + contaBancaria.numero
                + "\r\n" +
                "Titular: " + contaBancaria.titular
                + "\r\n" +
                "Saldo: R$ " + contaBancaria.saldo);

        scanner.close();
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
