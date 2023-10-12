package Modulo2;

import java.util.Scanner;

public class Desafio5 {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String entrada = scanner.nextLine();
    String[] partes = entrada.split(",");

    if (partes.length != 4) {
        System.out.println("Entrada inválida. Certifique-se de fornecer os quatro valores separados por vírgula.");
    } else {
        String data = partes[0].trim();
        String hora = partes[1].trim();
        String descricao = partes[2].trim();
        double valor = Double.parseDouble(partes[3].trim());
    
        // Crie uma instância da classe Transacao com os valores fornecidos pelo usuário
        Transacao conta = new Transacao(data, hora, descricao, valor);
    
        // Imprima os detalhes da Transacao
        conta.imprimir();
    }
    
    // Feche o scanner fora do bloco if-else
    scanner.close();
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}
