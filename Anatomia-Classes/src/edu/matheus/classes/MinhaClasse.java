package edu.matheus.classes;
public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Matheus";
        String segundoNome = "Andrade";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
