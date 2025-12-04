package principal3;

import java.util.Scanner;

public class Ejercicio2Extra {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si
		 * son iguales, además de si son iguales sin diferenciar entre mayúsculas y
		 * minúsculas.
		 */

		String frase, frase2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce dos frases");
		System.out.println("Frase número 1: ");
		frase = sc.nextLine();

		System.out.println("Frase número 2");
		frase2 = sc.nextLine();


		if (frase.equalsIgnoreCase(frase2)) {
			System.out.println("Frase1 es igual a frase2");
		} else {
			System.out.println("Frase1 es distinto a frase2");
		}
	}

}
