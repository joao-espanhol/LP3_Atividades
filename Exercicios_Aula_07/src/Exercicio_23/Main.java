//Desenvolver um programa que copia o conteúdo de um arquivo para outro.
package Exercicio_23;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("./arquivos/oldexample.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("./arquivos/newexample.txt"));
			String line;
	        
	        while ((line = reader.readLine()) != null) {
	        	writer.write(line);
	        	writer.newLine();
	        }
	        writer.close();
	        reader.close();
            System.out.println("Arquivo copiado!");

	    } catch (IOException e) {
	    		e.printStackTrace();
	    }
	}
}
