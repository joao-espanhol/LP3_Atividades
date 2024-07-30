/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Desenvolver um programa que calcula a soma e a média de uma lista de números inteiros.
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numbers = new ArrayList<>();
		
		System.out.println("Digite os números para calcular a média ou não insira nada para parar.");
	    try {
	        String str;
    	    while((str = reader.readLine()).equals("\n") || !str.trim().isEmpty()) {
                if(!str.equals("\n") && !str.trim().isEmpty()) {
                    numbers.add(Integer.parseInt(str));
                }
            }
	    } catch(IOException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }  
	    
	    System.out.print("Números inseridos: " + numbers);
	    
	    int soma = 0;
	    for(int number : numbers) {
	        soma += number;
	    }
	    System.out.println("\n\nA soma dos elementos inseridos na lista é: " + soma);
	    
	    int media = soma/numbers.size();
	    
	    System.out.println("A media dos elementos inseridos na lista é: " + media);
	}
}