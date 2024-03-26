package exercicio_01;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Selecione o primeiro valor: ");
		double a = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Selecione o segundo valor: ");
		double b = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Selecione a operacao: ");
		System.out.println("Somar: 1");
		System.out.println("Subtrair: 2");
		System.out.println("Multiplicar: 3");
		System.out.println("Dividir: 4");
		
		int opcao = scanner.nextInt();
		scanner.nextLine();
		switch (opcao) {
		case 1:
			double soma = calculadora.somar(a, b);
			System.out.println("Resultado: " + soma);
			break;
		case 2:
			double subt = calculadora.subtrair(a, b);
			System.out.println("Resultado: " + subt);
			break;
		case 3:
			double mult = calculadora.multiplicar(a, b);
			System.out.println("Resultado: " + mult);
			break;
		case 4:
			double div = calculadora.dividir(a, b);
			System.out.println("Resultado: " + div);
			break;
		default:
			System.out.println("Opção inválida.");
		}
		scanner.close();
	}
}
