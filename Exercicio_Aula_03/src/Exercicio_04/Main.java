package Exercicio_04;

public class Main {
	public static void main(String[] args) {
		Violao violao = new Violao();
		Piano piano = new Piano();
		
		violao.afinar();
		violao.tocar();
		
		piano.afinar();
		piano.tocar();
	}
}
