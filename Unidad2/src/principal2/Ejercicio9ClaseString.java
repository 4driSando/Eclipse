package principal2;

import java.util.Scanner;

public class Ejercicio9ClaseString {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase");
		frase = sc.nextLine();

		System.out.println("En mayúsculas: " + frase.toUpperCase());
		System.out.println("En minúsculas: " + frase.toLowerCase());
	}

}
