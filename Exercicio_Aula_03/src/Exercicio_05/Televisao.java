package Exercicio_05;

public class Televisao implements DispositivoEletronico{
	boolean estaLigado = false;
	
	public void ligar() {
		if (estaLigado == false) {
			System.out.println("Ligando a TV!");
			System.out.println("TV Ligada!");
			estaLigado = true;
		} else {
			System.out.println("A TV já está Ligada");
		}
	}
	public void desligar() {
		if (estaLigado == true) {
			System.out.println("Desigando a TV!");
			estaLigado = false;
		} else {
			System.out.println("...");
		}
	}
}
