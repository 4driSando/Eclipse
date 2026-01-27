package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03_U07 {

	public static void main(String[] args) {
		/**
		 * Implementa un programa que cree un array tipo double de tamaño 5 y lo rellene
		 * con 5 valores que solicite al usuario. Tendrás que manejar la/las posibles
		 * excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
		 */
		
		double[] array1 = new double[5];
		Scanner sc = new Scanner(System.in);
		double num;

		
		System.out.println("Introduce 5 doubles:");
		try {
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Número " + (i + 1));
			num = sc.nextDouble();
			array1[i] = num;
		}
		} catch (InputMismatchException e) {
			System.err.println("Ese valor no es un double");
		}
		
		sc.close();
	}

}
