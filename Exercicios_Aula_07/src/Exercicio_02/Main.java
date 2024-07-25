package Exercicio_02;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira sua String: ");
        String frase = scanner.nextLine();
        
        frase = frase.toUpperCase();
        frase = frase.replace(" ", "");
        
        int length = frase.length();
        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
        int qtdVogais = 0;
        
        for (int i = 0; i < length; i++) {
        	for (int j = 0; j < 5; j ++) {
        		if (frase.charAt(i) == vogais[j]) {
        			qtdVogais++;
        		}
        	}
        }
        System.out.print("Quantidade de vogais: " + qtdVogais);
        scanner.close();

	}
}
