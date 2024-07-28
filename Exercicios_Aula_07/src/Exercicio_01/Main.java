package Exercicio_01;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "";
		
		System.out.print("\nDigite uma palavra: ");
		word = scan.next().toUpperCase().replaceAll(" ", "");
		boolean palindrome = true;
		int lengthWord = word.length();
		
		for (int i=0; i < lengthWord; i++) {
			if(word.charAt(i) != word.charAt(lengthWord-1-i)) {
				palindrome = false;
			}
			
		}
		if (palindrome == true ) {
			System.out.print("\n É palindromo");
		}
		else {
			System.out.print("\n Não é palindromo");
		}
	}
	
	
//	public static void main(String[] args) {
//        String s = "Hello World!";
//        System.out.println("Length: " + s.length());
//        System.out.println("Character at index 1: " + s.charAt(1));
//        System.out.println("Substring (0-5): " + s.substring(0, 5));
//        System.out.println("Uppercase: " + s.toUpperCase());
//        System.out.println("Lowercase: " + s.toLowerCase());
//        System.out.println("Replace 'World' with 'Java': " + s.replace("World", "Java"));
//        System.out.println("Split by ', ': " + Arrays.toString(s.split(" ")));
//        
//	}
}
