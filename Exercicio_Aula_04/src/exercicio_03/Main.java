package exercicio_03;

public class Main {
	public static void main (String[] args) {
		Livro livro = new Livro();
		
		livro.titulo = "Senhor dos Aneis: A Sociedade do Anel";
		livro.autor = "J.R.R. Tolkien";
		livro.anoDePublicacao = 1954;
		
		livro.imprimirDetalhes();
	}
}
