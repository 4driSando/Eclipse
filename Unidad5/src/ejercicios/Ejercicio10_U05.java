package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio10_U05 {

	public static void main(String[] args) {

		int[] array1 = new int[1000];
		int respuesta;
		int contador = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100);
		}

		System.out.println("ARRAY ALEATORIO GENERADO CORRECTAMENTE");
		System.out.println("Introduzca un número hasta el 99");
		respuesta = sc.nextInt();

		Arrays.sort(array1);

		int posicion = Arrays.binarySearch(array1, respuesta);

		if (posicion >= 0) {

			System.out.print("El número " + respuesta + " aparece en las posiciones: ");

			for (int i = 0; i < array1.length; i++) {
				if (array1[i] == respuesta) {
					System.out.print(i + " ");
					contador++;
				}
			}

			System.out.println("\nTotal de apariciones: " + contador);

		} else {
			System.out.println("El número " + respuesta + " no existe en el array.");
		}

		SandoArrays.mostrarArray(array1);

		sc.close();
	}
}
