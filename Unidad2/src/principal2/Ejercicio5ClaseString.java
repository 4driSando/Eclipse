package principal2;

import java.util.Scanner;

public class Ejercicio5ClaseString {

	public static void main(String[] args) {

		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase que tenga la palabra 'coche'");
		frase = sc.nextLine();

		System.out.println("La primera letra de la palabra 'coche' se encuentra en " + frase.indexOf("coche"));
		
	}

}
