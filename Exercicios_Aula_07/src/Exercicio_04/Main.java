package Exercicio_04;
//Criar um programa que usa StringBuilder para construir uma string
// a partir de um array de palavras.

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String palavra = null;
		String [] frase = new String[100] ;
		int contador = 0;
		
		while (true) {
			System.out.println("Escreva sua palavra: ");
			palavra = scanner.nextLine();
			
			if (palavra.isEmpty()) 
			{ 
				break;
			} else {
				frase[contador] = palavra;
				contador++;
			}
		}
		for (int i = 0; i < contador; i++) {
			sb.append(" ").append(frase[i]);
		}
        System.out.println(sb.toString().trim());
		scanner.close();
	}
}
