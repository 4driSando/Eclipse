package principal3;

import java.util.Scanner;

public class Ejercicio7Extra {

	public static void main(String[] args) {

		/*
		 * Crear un programa que dada una cadena, y un carácter, indique cuántas veces
		 * se repite el carácter en la cadena.
		 */

		String frase, caracter;
		int numChar = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un carácter");
		caracter = sc.nextLine();
		caracter = caracter.substring(0, 1);

		System.out.println("Introduce una frase");
		frase = sc.nextLine();

		numChar = frase.length() - frase.replaceAll(caracter, "").length();
		System.out.println("Hay un total de " + numChar + " '" + caracter + "' en la frase: " + frase);
	}

}
