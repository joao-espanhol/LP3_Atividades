package Exercicio_16;
//Criar um programa que gerencia uma lista de tarefas, 
//permitindo adicionar, remover e listar tarefas.

import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite o prazo da tarefa (dd/MM/yyyy): ");
                    String prazoStr = scanner.nextLine();
                    Calendar prazo = Calendar.getInstance();
                    try {
                        String[] parts = prazoStr.split("/");
                        int dia = Integer.parseInt(parts[0]);
                        int mes = Integer.parseInt(parts[1]) - 1; // Janeiro é 0
                        int ano = Integer.parseInt(parts[2]);
                        prazo.set(ano, mes, dia);
                        gerenciador.adicionarTarefa(descricao, prazo);
                    } catch (Exception e) {
                        System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indexToRemove = scanner.nextInt();
                    gerenciador.removerTarefa(indexToRemove);
                    break;
                case 3:
                    gerenciador.listarTarefas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
