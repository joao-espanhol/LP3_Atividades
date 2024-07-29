package Exercicio_16;

import java.util.ArrayList;
import java.util.Calendar;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao, Calendar prazo) {
        Tarefa novaTarefa = new Tarefa(descricao, prazo);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada.");
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ": " + tarefas.get(i));
            }
        }
    }
}
