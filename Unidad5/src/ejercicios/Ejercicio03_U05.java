package ejercicios;

import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio03_U05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int respuesta1, respuesta2, cambio;
		int array1[] = new int[10];

		System.out.println("ARRAYS MORROCOTUDOS");
		System.out.println("-------------------");

		do {
			System.out.println("");
			System.out.println("MENÚ");
			System.out.println("1. Mostrar valores");
			System.out.println("2. Introducir valores");
			System.out.println("3. Salir");
			respuesta1 = sc.nextInt();

			switch (respuesta1) {
			case 1:
				SandoArrays.mostrarArray(array1);
				break;
			case 2:
				System.out.println("¿Qué posición desea cambiar?");
				respuesta2 = sc.nextInt();
				System.out.println("Introduzca un número para ponerlo en esa posición");
				cambio = sc.nextInt();

				if (respuesta2 > 10) {
					System.err.println("No hay tantas posiciones, compañerete");
				} else {
					array1[(respuesta2 - 1)] = cambio;
				}
				break;

			case 3:
				System.out.println("GRACIAS POR USAR EL PROGRAMA DE ARRAYS MORROCOTUDOS");
				break;

			default:
				System.err.println("Ese número introducido no es válido, compañerete");
				break;
			}

		} while (respuesta1 != 3);

		sc.close();

	}

}
