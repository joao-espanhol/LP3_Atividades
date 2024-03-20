package Exercicio_05;

public class Computador implements DispositivoEletronico{
	boolean estaLigado = false;
	public void ligar() {
		if (estaLigado == false) {
			System.out.println("Ligando o PC!");
			System.out.println("Ligando o PC!");
			System.out.println("Ligando o PC!");
			System.out.println("Ligando o PC!");
			System.out.println("Ligando o PC!");
			System.out.println("PC Ligado!");
			estaLigado = true;
		} else {
			System.out.println("O PC já está Ligado");
		}
	}
	public void desligar() {
		if (estaLigado == true) {
			System.out.println("Desigando o PC!");
			estaLigado = false;
		} else {
			System.out.println("...");
		}
	}
}
