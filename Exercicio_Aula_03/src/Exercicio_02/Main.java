package Exercicio_02;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> compras = new ArrayList<String>();
		
		compras.add("Alface");
		compras.add("Carne");
		compras.add("Banana");
		compras.add("Tomate");
		compras.add("Suco");
		compras.add("Ameixa");
		
		for (String item : compras) {
			System.out.println(item);
		}
		
		System.out.println("\n*** Removendo a Banana ***\n");
		compras.remove(2);
		
		for (String item : compras) {
			System.out.println(item);
		}
	}
}
