package Modulo1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = 5000;

        double taxaJuros = 0.08;

        int periodo = 5;

    
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}
