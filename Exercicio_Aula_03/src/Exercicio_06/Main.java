package Exercicio_06;

public class Main {
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.qtdPaginas = 258;
		
		try {
            livro.selecionaPagina();
        } catch (PaginaInvalida e) {
            System.out.println(e.getMessage());
        }
		
	}
}
