package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02_U07 {

	public static void main(String[] args) {
		/**
		 * Implementa un programa que pida dos valores int A y B utilizando un nextInt()
		 * (de Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán
		 * tratar de forma independiente las dos posibles excepciones,
		 * InputMismatchException y ArithmeticException, mostrando en cada caso un
		 * mensaje de error diferente en cada caso.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		try {
			System.out.println("Introduce dos números para dividir");
			System.out.println("Número 1:");
			num1 = sc.nextInt();
			System.out.println("Número 2:");
			num2 = sc.nextInt();
			int division = num1 / num2;
			System.out.println("El resultado de la división es " + division);

		} catch (InputMismatchException e) {
			System.err.println("Has introducido algo que no es un entero, compañerete");
		} catch (ArithmeticException e) {
			System.err.println("Esa división no es válida: " + e.getMessage());
		}
		sc.close();
	}

}
