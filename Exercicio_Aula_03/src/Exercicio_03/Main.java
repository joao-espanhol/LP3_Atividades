package Exercicio_03;

public class Main {
	public static void main(String[] args) {
		
		Flor flor = new Flor();
		flor.especie = "Azaleia";
		flor.cor = "Azul";
		
		Arvore arvore = new Arvore();
		arvore.especie = "Caquizeiro";
		arvore.fruto = "Caqui";
		
		flor.exibirCor();
		flor.fotossintese();
		arvore.exibirFruto();
		arvore.fotossintese();
	}
}
