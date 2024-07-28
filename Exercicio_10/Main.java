package Exercicio_10;
// Converter uma lista de strings em uma lista de inteiros.

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");

        List<Integer> intList = new ArrayList<>();

        for (String str : stringList) {
            try {
                intList.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Lista de inteiros: " + intList);
    }
}
