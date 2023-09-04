import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nomeCliente = ""; 

        System.out.println("Qual a sua agência? ");
        String agencia = scanner.next();

        System.out.println("Agora insira o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite primeiro seu nome e em seguida o sobrenome");
        String nome = scanner.next();
        String sobrenome = scanner.next();
        
        nomeCliente = nome +" ".concat( sobrenome);

        System.out.println("Qual o valor do seu depósito inicial? ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Olá ".concat(nomeCliente) + " " 
        + "agradeçemos por criar uma conta em nosso banco, sua agência é: " 
        + agencia + "," + "conta: " 
        + numero + " " + "e seu saldo: R$"
        + saldo + " já esta disponível para saque!");
    }
}