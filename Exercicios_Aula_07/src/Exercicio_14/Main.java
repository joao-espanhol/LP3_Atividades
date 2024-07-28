package Exercicio_14;
//Desenvolver um programa que adiciona um número específico 
// de dias a uma data e exibe a nova data.

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva seu número: ");
		
		int numero = 0;
		
		numero = Integer.parseInt(scanner.nextLine());
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, numero);
        Date futureDate = cal.getTime();
        System.out.println("Dia futuro: " + futureDate);
        
        scanner.close();
	}
}
