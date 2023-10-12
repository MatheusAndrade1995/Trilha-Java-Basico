package Modulo1.CadastrarCliente;
import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        Pessoa Paulo = new Pessoa("Paulo Cesar", "45729681879");

        String endereco = scanner.nextLine();
        Paulo.setEndereco(endereco);
        
        
        System.out.println("Temos o cliente: " + Paulo.getNome() + ", portador do CPF: " + Paulo.getCpf() + " Morador do endereço: " + Paulo.getEndereco() + " registrado em nossa base");

        scanner.close();
        
    }

}
