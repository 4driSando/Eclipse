package principal2;

import java.util.*;

public class Ejercicio1ClaseString {

	public static void main(String[] args) {

		String palabra;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra para saber cuántas letras tiene");
		palabra = sc.next();

		System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras ");
	}

}
