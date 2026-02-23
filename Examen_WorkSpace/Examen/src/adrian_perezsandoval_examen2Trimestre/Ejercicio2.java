package adrian_perezsandoval_examen2Trimestre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaro enteros y scanner
		Scanner sc = new Scanner(System.in);
		int respuesta = 1;

		System.out.println("Introduce longitud del array:");

		// Compruebo que sea un entero
		try {
			respuesta = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Eso no es un entero");
			sc.next();
		}

		// Genero el array
		int[] array = generaArrayMultiplos(respuesta);
		System.out.println("Array generado (múltiplos de 3 en las posiciones múltiplos de 3)");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nArray ordenado:");

		sc.close();
	}

	/**
	 * Método que genera un Array de la longitud indicada
	 * 
	 * @param longitud del array
	 * @return array random
	 */
	public static int[] generaArrayMultiplos(int longitud) {
		int[] array = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			int random = (int) (1 + Math.random() * (20 - 1 + 1));
			if (i == 0) {
				array[3] = random;
			}

			if ((random / 3) == 0) {
				array[i * 3] = random;
			} else {
				array[i] = random;
			}
		}
		return array;
	}
}
