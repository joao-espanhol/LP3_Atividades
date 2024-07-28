//Escrever um programa que encontra o maior e o menor valor em uma lista de números.

package Exercicio_18;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class Main {
	public static void main (String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List numbers = new ArrayList();

		System.out.print("Digite \\p para encerrar. ");
		
		try {
			while (true) {
				System.out.print("Digite um número para a lista: ");
				String input = reader.readLine();
				if(input == "\\p" || input == null || input.isEmpty()) {
					break;
				}
				else {
					float number = Float.parseFloat(input);
					numbers.add(number);
				}
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		Collections.sort(numbers);
		
//		outra solução
//		float max = 0, min = 0;
//		for(float number : numbers) {
//			if(number > max) {
//				max = number;
//			}
//			
//			if (number < min) {
//				min = number;
//			}
//		}
		
		
		System.out.print("O maior valor apresentado é " + numbers.get(numbers.size()-1));
		System.out.print("\nO menor valor apresentado é " + numbers.get(0));
		}
	
}
