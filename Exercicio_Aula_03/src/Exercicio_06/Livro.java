package Exercicio_06;

import java.util.Scanner;

public class Livro {
	String nome;
	int qtdPaginas;
	int pagina;
	
	public void selecionaPagina() throws PaginaInvalida{
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Escolha uma Página:");
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
		pagina = opcao;
		if (opcao < 1 || opcao > qtdPaginas) {
			scanner.close();
			throw new PaginaInvalida("Página Invalida");
			
		} else {
			System.out.println("Pagina " + opcao + " selecionada!");
		}
		scanner.close();
	}
}
