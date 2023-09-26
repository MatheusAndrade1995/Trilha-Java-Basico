package Modulo1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        // Entrada dos tipos de ativos
        System.out.println("Informe a quantidade de ativos: ");
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        // Entrada dos códigos dos ativos
        System.out.println("Iniciando laço de repetição ");
        for (int i = 0; i < quantidadeAtivos; i++) {
            System.out.println("Informe um tipo de ativo ");
            String codigoAtivo = scanner.nextLine();
            if (!codigoAtivo.isEmpty()) {
                ativos.add(codigoAtivo);
            } else {
                System.out.println("Um ativo precisa ser informado!");
            }
            
        }

        scanner.close();
        // TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        // TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        for (String ativo : ativos)
        System.out.println(ativo);
    }
}