package principal2;

import java.util.*;

public class Ejercicio12ClaseString {

	public static void main(String[] args) {

		String frase, hola, mundo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase");
		frase = sc.nextLine();

		hola = frase.substring(0, 4);
		hola.toLowerCase();

		mundo = frase.substring(frase.length() - 5);
		mundo.toLowerCase();

		if (hola.equals("hola") && mundo.equals("mundo")) {
			System.out.println("La frase empieza por hola y termina por mundo");
		} else if (hola.equals("hola") && !mundo.equals("mundo")) {
			System.out.println("La frase empieza por hola pero no acaba en mundo");
		} else if (!hola.equals("hola") && mundo.equals("mundo")) {
			System.out.println("La frase no empieza por hola pero sí que termina en mundo");
		} else {
			System.out.println("La frase ni empieza por hola ni acaba en mundo");
		}
	}
}