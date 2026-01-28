package ejercicios;

import java.util.Scanner;

public class Ejercicio05_U07 {

	public static void main(String[] args) {

		int p;
		Scanner sc = new Scanner(System.in);

		// Comprueba que sea mayor que 0
		System.out.print("Introduce un número: ");
		try {
			p = sc.nextInt();
			imprimePositivo(p);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		// Comprueba que sea menor que 0
		System.out.print("Ahora introduce otro: ");
		try {
			p = sc.nextInt();
			imprimeNegativo(p);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}
		sc.close();
	}

	static void imprimePositivo(int p) throws ArithmeticException {
		if (p < 0) {
			throw new ArithmeticException(p + " es menor que 0");
		} else {
			System.out.println(p + " es mayor que 0");
		}
	}
	
	static void imprimeNegativo(int p) throws ArithmeticException {
		if (p >= 0) {
			throw new ArithmeticException(p + " es mayor o igual a 0");
		} else {
			System.out.println(p + " es menor que 0");
		}
	}

}
