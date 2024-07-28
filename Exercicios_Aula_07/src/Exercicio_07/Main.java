// insere uma string em outra string em uma posiçâo específica usando StringBuilder
package Exercicio_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float cat1, cat2, hipo;
		
		try {
			System.out.print("Digite o valor do primeiro cateto: ");
			cat1 = Float.parseFloat(reader.readLine());
			System.out.print("Digite o valor do segundo cateto: ");
			cat2 = Float.parseFloat(reader.readLine());			
		
			Triangulo tria = new Triangulo(cat1, cat2);
			tria.calcHipo();
			hipo = tria.getFace3();
			
			System.out.printf("O valor da hipotenusa é: %.2f", hipo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}
}