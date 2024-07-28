// insere uma string em outra string em uma posiçâo específica usando StringBuilder
package Exercicio_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main
{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder phrase = new StringBuilder();
		int position = 0;
		
		try {
		    System.out.print("Digite uma frase: ");
    		phrase.append(reader.readLine());
    		
    		System.out.printf("A frase inserida tem %d posições.\n", phrase.length());
    		System.out.printf("Digite uma posição entre 0 e %d em que deseja adicionar uma palavra: ", phrase.length());
    		position = Integer.parseInt(reader.readLine());
    		
    		System.out.print("Digite as palavras que deseja adicionar: ");
    		String word = reader.readLine();
    		
    		if (position == 0) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                phrase.setCharAt(0, Character.toLowerCase(phrase.charAt(0)));
                phrase.insert(0, word + " ");
            } 
            else if (position == phrase.length()) {
                phrase.insert(position, " " + word + ".");
            }
            else {
                phrase.insert(position, " " + word + " ");
            }
        
    		
    		System.out.printf("A nova frase ficou: %s", phrase);
		} 
		catch(Exception e) {
		    e.printStackTrace();
		}
	}
}