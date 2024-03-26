package exercicio_02;

public class Main {
	public static void main(String[] Args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "Rafael";
		estudante.idade = 15;
		estudante.nota = 8;
		boolean situacao = estudante.aprovado(estudante.nota);
		
		System.out.println("Aluno: " + estudante.nome);
		System.out.println("Idade: " + estudante.idade);
		System.out.println("Situação: ");
		estudante.situacao(situacao);
	}
}
