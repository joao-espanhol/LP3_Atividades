package Exercicio_09;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Desenvolver um programa que encontra o maior valor em um array de inteiros.

public class Main {
	 public static void main(String[] args) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     List<Integer> integers = new ArrayList<>();
	     try {
	    	 System.out.print("Aperte enter para encerrar.");
	    	 while (true) {
	    		 System.out.print("Digite um número para a lista: ");
	    		 String phrase = reader.readLine();
	    		 if(phrase == "\\p" || phrase == null || phrase.isEmpty()) {
	    			 break;
	    		 }
	    		 else {
	    			 int number = Integer.parseInt(phrase);
	    			 integers.add(number);
				}
	    	 }
	            
	         // Print the stored integers
	         System.out.println("Integers stored: " + integers);
	            
	         // Find the maximum value
	         if (integers.isEmpty()) {
	        	 System.out.println("No integers were entered.");
	         } else {
	        	 int max = integers.get(0);
	             for (int integer : integers) {
	            	 if (integer > max) {
	            		 max = integer;
	            	 }
	             }
	             System.out.println("The maximum value entered is: " + max);
	         }
	     }
	     catch(IOException e) {
	         e.printStackTrace();
	     }
	 }
}
