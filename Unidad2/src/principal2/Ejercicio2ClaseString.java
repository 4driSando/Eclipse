package principal2;

import java.util.*;

public class Ejercicio2ClaseString {

	public static void main(String[] args) {

		String palabra, palabra2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		palabra = sc.next();

		System.out.println("Introduce otra palabra");
		palabra2 = sc.next();

		System.out.println("La cadena de los Strings es la siguiente: " + palabra.concat(palabra2));
	}
}
