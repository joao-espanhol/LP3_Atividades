package Exercicio_24;
// Escrever um programa que grava um array de strings em um arquivo, 
//com cada string em uma nova linha.

import java.io.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = null;
		String [] texto = new String[100] ;
		int contador = 0;
		while (true) {
			System.out.println("Escreva sua frase: ");
			frase = scanner.nextLine();
			
			if (frase.isEmpty()) 
			{ 
				break;
			} else {
				texto[contador] = frase;
				contador++;
				
				System.out.print("Texto agora: ");
                for (int i = 0; i < contador; i++) {
                    System.out.print(texto[i] + " ");
                }
                System.out.println();
			}
		}
		try {
            // Escrever em um arquivo
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
	        
            for (int i = 0; i < contador; i++) {
            	writer.write(texto[i]);
	            writer.newLine();
            }
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
		scanner.close();
	}
}
