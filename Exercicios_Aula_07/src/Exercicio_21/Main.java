package Exercicio_21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.adicionarContato(new Contato("Nicolas Silva", "1234-5678"));
        agenda.adicionarContato(new Contato("Maria Eduarda", "8765-4321"));
        agenda.adicionarContato(new Contato("João Pedro", "1357-2468"));
        
        System.out.println("Lista de contatos:");
        agenda.listarContatos();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try {
            while (true) {
                System.out.println("Digite\n\t\"Buscar\" para procurar um contato");
                System.out.println("\t\"Adicionar\" para procurar um contato");
                System.out.println("\t\"Remover\" para procurar um contato");
                System.out.println("\t\"Finalizar\" para procurar um contato");
                input = reader.readLine();
                
                if ("Finalizar".equalsIgnoreCase(input)) {
                    System.out.println("Programa finalizado.");
                    break;
                }
                
                if (input.equals("Buscar")) {
                    System.out.print("\nDigite o nome do contato que deseja procurar: ");
                	String nome = reader.readLine();
                	Contato contato = agenda.buscarContatoPorNome(nome);
                	if (contato != null) {
                		System.out.println("\nContato encontrado: " + contato);
                	} else {
                		System.out.println("\nContato não encontrado.\n");
                	}
                }
                
                if (input.equals("Adicionar")) {
                	System.out.print("\nDigite o nome do novo contato: ");
                	String nome = reader.readLine();
                	System.out.print("\nDigite o telefone do novo contato: ");
                	String telefone = reader.readLine();
                	
                	agenda.adicionarContato(new Contato(nome, telefone));
                	System.out.println("\nContato adicionado com sucesso.\n");
                	agenda.listarContatos();
                }
                
                if (input.equals("Remover")) {
                	String nome = reader.readLine();
                	System.out.print("\nDigite o nome do contato que deseja apagar: ");
                	agenda.removerContato(nome);
                	System.out.print("\nContato apagado com sucesso!\n");
                	agenda.listarContatos();
                }
            }
        } 
        catch (IOException e) {
            System.out.println("Erro ao ler a entrada: " + e.getMessage());
        }
    }
}
