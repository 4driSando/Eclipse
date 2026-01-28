package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04_U07 {

	public static void main(String[] args) {
		/**
		 * Implementa un programa que cree un vector de enteros de tamaño N (número
		 * aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le
		 * preguntará al usuario qué posición del vector quiere mostrar por pantalla,
		 * repitiéndose una y otra vez hasta que se introduzca un valor negativo. Maneja
		 * todas las posibles excepciones.
		 */

		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random() * 100 + 1);
		int[] array1 = new int[a];
		int respuesta = 0;

		for (int i = 0; i < array1.length; i++) {
			int b = (int) (Math.random() * 10 + 1);
			array1[i] = b;
		}

		do {
			try {
				System.out
						.println("Introduce una posición para ver su valor. Tamaño del array = " + (array1.length - 1));
				respuesta = sc.nextInt();
				System.out.println("En la posición " + respuesta + " está el siguiente número: " + array1[respuesta]);
			} catch (InputMismatchException e) {
				System.err.println("Eso no es un entero, compañerete");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Tu valor está fuera del array");
			}
		} while (respuesta > 0);

		sc.close();
	}

}
