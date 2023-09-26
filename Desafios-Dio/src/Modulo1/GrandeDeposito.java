package Modulo1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GrandeDeposito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        double valor = scanner.nextDouble();

        if (valor > 0) {
            // TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            double saldo = valor;
            System.out.println("Deposito realizado com sucesso!\r\n" +
                    "Saldo atual: R$ " + df.format(saldo));
            
        } else if (valor == 0) {
            // TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Encerrando o programa...");
        } else {
            // TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }

        scanner.close();
    }
}
