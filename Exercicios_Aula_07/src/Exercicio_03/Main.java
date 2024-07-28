package Exercicio_03;
import java.util.Scanner;

public class Main {
	public static int search (String phrase, char letter) {
		for(int i=0; i < phrase.length()-1; i++) {
			if(phrase.toLowerCase().charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String phrase = "";
		char letter;

		System.out.print("Digite a frase que deseja analisar: ");
		phrase = scan.nextLine();
		scan.nextLine();
		
		System.out.print("Digite a letra (será considerado o primeiro caracter digitado)"
				+ " que deseja encontrar na frase: ");
		letter = scan.nextLine().toLowerCase().charAt(0);
		scan.nextLine();
		
		int founded = search(phrase, letter);
		if (founded != -1) {
			System.out.printf("A primeira ocorrência da letra '%c' na frase '%s' é na posição %d"
					, letter, phrase, founded);

		}
		else {
			System.out.println("A letra digitada não foi encontrada na frase.");
		}
	}	
}