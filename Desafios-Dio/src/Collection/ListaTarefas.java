package Collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.AdicionarTarefa("");
        listaTarefa.AdicionarTarefa("");
        listaTarefa.AdicionarTarefa("");
        listaTarefa.AdicionarTarefa("");

        System.out.println("A quantidade de descrições atualmente na lista é de: " + listaTarefa.ObterNumeroTotalTarefas() + " tarefas");

        //System.out.println("Descritivo de tarefas: " + ObterDescricoesTarefas());
        listaTarefa.RemoverTarefa("");

        System.out.println("A quantidade de descrições atualmente na lista é de: " + listaTarefa.ObterNumeroTotalTarefas() + " tarefas");

        listaTarefa.ObterDescricoesTarefas();

    }

    Scanner scanner = new Scanner(System.in);
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao) {
        System.out.println("Insira uma descrição de nova tarefa");
        descricao = scanner.nextLine();
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao) {
        System.out.println("Insira a descrição da tarefa que deseja remover");
        descricao = scanner.nextLine();
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                TarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(TarefasParaRemover);
    }

    public int ObterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void ObterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

}
