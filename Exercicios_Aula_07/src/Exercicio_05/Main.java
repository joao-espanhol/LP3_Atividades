package Exercicio_05;
//Desenvolver um programa que remove todas as vogais de uma string usando StringBuilder.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira sua String: ");
        String frase = scanner.nextLine();
		StringBuilder sb = new StringBuilder(frase);
		
        char[] vogais = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
		
		for (int i = 0; i < sb.length(); i++) {
            for (char vogal : vogais) {
                if (sb.charAt(i) == vogal) {
                    sb.deleteCharAt(i);
                    i--;
                    break;
                }
            }
        }
		
        System.out.print("String sem vogais: " + sb.toString());
        scanner.close();
	}
}