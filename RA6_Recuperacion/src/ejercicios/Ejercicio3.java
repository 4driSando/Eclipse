package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int respuesta;

		do {
			System.out.println("\nMENÚ");
			System.out.println("1. Mostrar valores");
			System.out.println("2. Introducir valor al final");
			System.out.println("3. Introducir valor en X posición");
			System.out.println("4. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println(array);
				break;

			case 2:
				System.out.println("Número a introducir:");
				int respuesta2 = sc.nextInt();
				array.add(respuesta2);
				break;

			case 3:
				System.out.println("Posición en la que introducir el número:");
				int posicion = sc.nextInt();
				System.out.println("Número a introducir:");
				int numero = sc.nextInt();

				if (posicion > array.size()) {
					array.add(numero);
				} else {
					array.add(posicion - 1, numero);
				}
				break;

			case 4:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Número no válido");
				break;
			}

		} while (respuesta != 4);

		sc.close();
	}

}
