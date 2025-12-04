package principal3;

import java.util.Scanner;

public class Ejercicio6Extra {

	public static void main(String[] args) {
		/*
		 * Crear un programa que dada una cadena invertir la misma y mostrar por
		 * pantalla. Ejemplo: Entrada: "casa blanca" Salida: "acnalb asac"
		 */

		String frase, esarf = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
		    esarf += frase.charAt(i);
		}
	
		System.out.println(esarf);
	}
	
}