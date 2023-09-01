public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero++;

        // ou numero = numero + 2;

        System.out.println(numero);

        {
            int a = 5;
            int b = 5;

            // Utilizando Operador ternario, lembrando que a primeira operação deve ser
            // booleana ou seja true ou false
            String resultado = a == b ? "verdadeiro" : "falso";

            // Instruções utilizando IF para verificar valores que pode ser substituida como
            // o exemplo acima
            /*
             * if (){
             * resultado = ;
             * }
             * else{
             * resultado = "falso";
             * }
             */

            System.out.println("A comparação entre os valores é: ".concat(resultado));

            // Operadores Relacionais
            {
                boolean numero1 = true;
                boolean numero2 = true;

                boolean simNao = numero1 == numero2;
                System.out.println("numeroUm é igual ao numeroDois?" + simNao);

                simNao = numero1 != numero2;
                System.out.println("numeroUm é diferente do numeroDois?" + simNao);

                // simNao = numero1 > numero2;
                // System.out.println("numeroUm é maior que o numeroDois?" + simNao);

                String nomeUm = "Matheus";
                String nomeDois = "Andrade";

                System.out.println("O nomeUm é igual ao nomeDois " + nomeUm.equals(nomeDois));

                // Operadores Lógicos
                if (numero1 && numero2) {
                    System.out.println("As duas condições são verdadeiras");
                }
                if (numero1 || numero2) {
                    System.out.println("Uma das condições é verdadeira");
                }
            }
        }
    }

}
