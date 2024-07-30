//Criar um programa que gerencia um inventário de produtos, permitindo adicionar, remover e buscar produtos pelo nome.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> products = new ArrayList();
        
	        products.add("Celular");
	        products.add("Placa mãe");
	        products.add("HDD");
	    
		System.out.print("Produtos da loja: " + products);
		System.out.println("Digite: \n\"add\" para adicionar");
		System.out.println("\"rem\" para remover");
		System.out.println("\"bus\" para buscar");
		System.out.println("\"fim\" para encerrar");
		String input;
		try {
			do {
                System.out.print("\nDigite o procedimento que deseja fazer: ");
			    input = reader.readLine();
				if(input.toLowerCase().equals("add") && !input.trim().isEmpty()) {
				    System.out.print("Digite o produto que deseja adicionar: ");
                    input = reader.readLine();
                    boolean product = true;
				    for(int i = 0; i < products.size(); i++) {
					    if(products.get(i).equals(input)) {
        			        System.out.println("\nEste produto já foi adicionado!");   
					        product = false;
					    }
					}
					if (product) {
        			    products.add(input);
        				System.out.println("\nProduto adicionado com sucesso!");
        				System.out.println(products);
					}
				}
				
				if(input.toLowerCase().equals("rem") && !input.trim().isEmpty()) {
			        System.out.print("\nDigite o produto que deseja remover: ");
                    input = reader.readLine();
					for(int i = 0; i < products.size(); i++) {
					    if(products.get(i).equals(input)) {
					        products.remove(i);			        
					        System.out.println("\nProduto removido com sucesso!");
					    }
					}
				}
			    
			    if(input.toLowerCase().equals("bus") && !input.trim().isEmpty()) {
					System.out.print("\nDigite o produto que deseja buscar: ");
                    input = reader.readLine();
					for(int i = 0; i < products.size(); i++) {
					    if(products.get(i).equals(input)) {
					        System.out.printf("\nProduto encontrado! Guardado na posição: %d\n", i);
					    }
					}
				}
			} 
			while(!input.equals("fim"));
		} 
		catch(IOException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("Programa encerrado.");
	reader.close();
	}
}
