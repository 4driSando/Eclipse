package principal;

import java.util.Scanner;

public class Ejercicio58_U02 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que cree un array con 100 números aleatorios entre 0 y 50, y
		 * luego le pida al usuario un valor R (entre 0 y 50). Por último, mostrará
		 * cuántos valores del array son igual o superiores a R.
		 * 
		 * Crear array con 100 numsaleatorios de 0 a 50 Pedir valor R (0 a 50) Mostrar
		 * cuántos valores hay superiores
		 */

		int[] aleatorios = new int[100];
		int numeroR, numerosMayores;
		int contador = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) (Math.random() * 50 + 1);
		}

		System.out.println("Introduzca un número del 0 al 50");
		numeroR = sc.nextInt();

		System.out.print("| ");
		for (int i = 0; i < aleatorios.length; i++) {
			if (aleatorios[i] > numeroR) {
				numerosMayores = aleatorios[i];
				System.out.print(numerosMayores+ " | ");
				contador++;
			}
		}

		System.out.println("\nHay un total de " + contador + " números superiores a " + numeroR);

	}

}
