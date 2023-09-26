package Modulo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o quanto deseja depositar em sua conta");
        int saldoTotal = scanner.nextInt();
        System.out.println("Insira o quanto deseja retirar");
        int valorSaque = scanner.nextInt();

        // TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos

        if (saldoTotal >= valorSaque) {
            int saldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
        scanner.close();
    }
}