package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
        String[] candidatos = { "FELIPE", "MARCIA", "ALINE", "MAURICIO", "JOÃO", "PEDRO" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

        SelecaoCandidatos();
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = Atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        {
            if (atendeu) {
                System.out
                        .println("Conseguimos contato com: " + candidato + " na tentativa N° " + tentativasRealizadas);
            } else {
                System.out.println("Não conseguimos contato com o " + candidato + ", número maximo de tentativas "
                        + tentativasRealizadas);
            }
        }
    }

    static boolean Atender() {
        return new Random().nextInt(3) == 1;

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void SelecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "ALINE", "MAURICIO", "JOÃO", "PEDRO", "MARCIO", "CLARA" };
        String[] candidatosFinal = new String[5];

        int selecaoCandidatos = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (selecaoCandidatos < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " " + "solicitou salário base: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!!!");
                String candidatoSelecionado = candidato;
                candidatosFinal[selecaoCandidatos] = candidatoSelecionado;
                selecaoCandidatos++;

            }
            candidatosAtual++;
        }
        System.out.println("Candidatos Selecionados:");
        for (String candidatoSelecionado : candidatosFinal) {
            if (candidatoSelecionado != null) {
                System.out.println(candidatoSelecionado);
            }
        }
    }

    /*
     * static void AnalisarCandidato(double salarioPretendido) {
     * double salarioBase = 2000.0;
     * if (salarioBase > salarioPretendido) {
     * System.out.println("Ligar para o candidato");
     * } else if (salarioBase == salarioPretendido) {
     * System.out.println("Ligar para o candidato com contra proposta");
     * } else {
     * System.out.println("Aguardando o resultado dos demais candidatos");
     * }
     * }
     */
}
