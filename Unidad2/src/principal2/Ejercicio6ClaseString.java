package principal2;

import java.util.Scanner;

public class Ejercicio6ClaseString {

	public static void main(String[] args) {

			String frase; 
			String letra = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce una frase que tenga la palabra 'coche'");
			frase = sc.nextLine();
			System.out.println("Introduce una letra para ubicar su últma posición");
			letra = sc.next();

			System.out.println("La ultima letra " +letra+ " de la frase " +frase+ " se encuentra en el lugar " + frase.lastIndexOf(letra));
			
		}
	}