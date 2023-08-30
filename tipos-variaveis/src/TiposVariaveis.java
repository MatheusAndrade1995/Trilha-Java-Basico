public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //forma correta de aplicar a casa decimal, não utilizando "."
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero); 
        //caso não seja setado o valor final antes do tipo o valor pode ser alterado posteriormente
        //a declaração da variavel
        
        final double valor_de_pi = 3.14;
        //ao atribuir o final o valor da variavel se torna fixo

    }
}
