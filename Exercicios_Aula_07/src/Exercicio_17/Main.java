//Desenvolver um programa que ordena uma lista de nC:meros inteiros.
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
		List<Integer> numbers = new ArrayList<>();

		System.out.println("Digite os números para ordenar a lista ou não insira nada para parar.");
		try {
			String str;
			while((str = reader.readLine()).equals("\n") || !str.trim().isEmpty()) {
				if(!str.equals("\n") && !str.trim().isEmpty()) {
					numbers.add(Integer.parseInt(str));
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Lista inserida: " + numbers);
        	Collections.sort(numbers);
        	System.out.println("Lista organizada: " + numbers);
		reader.close();
	}
}
