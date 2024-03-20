package Exercicio_05;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Televisao televisao = new Televisao();
		Computador computador = new Computador();
		
		
		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Ligar TV");
			System.out.println("2. Desligar TV");
			System.out.println("3. Ligar PC");
			System.out.println("4. Desligar PC");
			System.out.println("5. Sair");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
			case 1:
				televisao.ligar();
				break;
			case 2:
				televisao.desligar();
				break;
			case 3:
				computador.ligar();
				break;
			case 4:
				computador.desligar();
				break;
			case 5:
				System.out.println("Saindo...");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
}
