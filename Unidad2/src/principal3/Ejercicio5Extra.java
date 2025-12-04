package principal3;

import java.util.Scanner;

public class Ejercicio5Extra {

	public static void main(String[] args) {
		/*
		 * Crea un programa que cuente las vocales y consonantes de una frase. Ten
		 * cuidado con los espacios, se deben ignorar.
		 */

		String frase;
		int vocales = 0, consonantes = 0;
		char letra;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		frase = frase.toUpperCase();

		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			switch (letra) {
			case 'A', 'Á', 'E', 'É', 'I', 'Í', 'O', 'Ó', 'U', 'Ú':
				vocales++;
				break;
			case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X',
					'Y', 'Z':
				consonantes++;
				break;
			}

		}
		System.out.println("En la frase '" + frase + "' hay un total de " + vocales + " vocales y un total de "
				+ consonantes + " consonantes");
	}
}
