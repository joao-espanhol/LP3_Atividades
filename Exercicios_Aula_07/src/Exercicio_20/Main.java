package Exercicio_20;
//Desenvolver um programa que conta a frequência de palavras em um texto.

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        String texto = null;
        String[] textoTratado = new String[500];
        
        System.out.println("Insira seu texto:");

        texto = scanner.nextLine().toUpperCase();
        
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");

        
        textoTratado = texto.split(" ");
        
        for (int i = 0; i < textoTratado.length; i++) {
        	System.out.println(textoTratado[i]);
        	if (map.get(textoTratado[i]) == null) {
        		map.put(textoTratado[i], 1);
        	}else {
        		map.put(textoTratado[i], map.get(textoTratado[i]) + 1);
        	}
        	
        }
        
        System.out.println("Ocorrências das palavras:");
        for (String key : map.keySet()) {
            System.out.println(key + ", Ocorrências: " + map.get(key));
        }
	}
}
