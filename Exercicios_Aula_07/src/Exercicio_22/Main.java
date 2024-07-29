package Exercicio_22;
//Criar um programa que lê um arquivo de texto linha por linha e imprime o conteúdo no console.

import java.io.*;

public class Main {
	public static void main (String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
	        String line;
	        int i = 1;
	        while ((line = reader.readLine()) != null) {
	        	
	            System.out.println("Linha " + i + " : " + line);
	        }
	        reader.close();
            System.out.println("Fim do Arquivo");

	    } catch (IOException e) {
	    		e.printStackTrace();
	    }
	}
}