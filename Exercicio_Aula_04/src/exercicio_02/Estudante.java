package exercicio_02;

public class Estudante {
	String nome;
	int idade;
	double nota;
	
	public boolean aprovado (double nota){
		if (nota < 7.0) {
			return false;
		}else {
			return true;
		}
	}
	public void situacao (boolean situacao) {
		if (situacao == true) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
