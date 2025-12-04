package principal3;

import java.util.Scanner;

public class Ejercicio1Extra {

	public static void main(String[] args) {
		
		/*
		 * Crea un programa que pida una cadena de texto por teclado y luego muestre
		 * cada palabra de la cadena en una línea distinta.
		 *
		 * pedir cadena de texto
		 * mostrar cada palabra en linea distinta
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.print("Introduce una frase: ");
		frase = sc.nextLine();
		
		System.out.println(frase.replace(" ", "\n"));
	}

}
