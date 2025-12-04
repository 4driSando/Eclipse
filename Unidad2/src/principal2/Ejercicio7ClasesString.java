package principal2;

import java.util.Scanner;

public class Ejercicio7ClasesString {

	public static void main(String[] args) {

		String palabra;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		palabra = sc.next();
		
        if (palabra.startsWith("pre") && palabra.endsWith("ción")) {
            System.out.println("La palabra empieza con 'pre' y termina con 'ción'");
        } else {
            System.out.println("La palabra no cumple, mi rey :(");
        }
	}

}
