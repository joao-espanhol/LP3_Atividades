package exercicio_03;

public class Livro {
	String titulo;
	String autor;
	int anoDePublicacao;
	
	public void imprimirDetalhes() {
		System.out.println("Título do livro: " + titulo);
		System.out.println("Autor do livro: " + autor);
		System.out.println("Ano de Publicação: " + anoDePublicacao);
	}
}
