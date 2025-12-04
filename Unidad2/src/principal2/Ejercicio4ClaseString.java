package principal2;

import java.util.Scanner;

public class Ejercicio4ClaseString {

	public static void main(String[] args) {

		String palabra;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra para saber sus tres primeras letras");
		palabra = sc.next();
		char[] primeros = palabra.toCharArray();
		
		System.out.print("Las tres primeras letras son ");
		System.out.print(primeros[0]);
		System.out.print(primeros[1]);
		System.out.print(primeros[2]);
		
	}

}
