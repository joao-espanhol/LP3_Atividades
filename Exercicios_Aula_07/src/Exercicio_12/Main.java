package Exercicio_12;
// Criar um programa que lê uma string de números e retorna a soma total.

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("5");
        stringList.add("12");
        stringList.add("4");
        stringList.add("10");

        List<Integer> intList = new ArrayList<>();

        for (String str : stringList) {
            try {
                intList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int soma = 0;
        for (int i = 0; i < intList.size(); i++) {
        	soma = soma + intList.get(i);
        }
        System.out.println("Soma dos Inteiros: " + soma);
	}
}
