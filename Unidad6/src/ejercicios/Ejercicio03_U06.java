package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03_U06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int respuesta, respuesta2, respuesta3, respuesta4;

		do {
			System.out.println("MENÚ MORROCOTUDO");
			System.out.println("----------------");
			System.out.println("1. Mostrar valores");
			System.out.println("2. Introducir valor al final");
			System.out.println("3. Introducir valor en x posición");
			System.out.println("4. Salir");
			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				System.out.println(numeros);
				break;

			case 2:
				System.out.println("Valor que quieres introducir");
				respuesta2 = sc.nextInt();
				numeros.add(respuesta2);
				break;
			
			case 3:
				System.out.println("Posición en la que quieres introducir un valor (hasta "+ numeros.size()+ ")");
				respuesta3 = sc.nextInt();
				if (respuesta3 < numeros.size()) {
					System.out.println("Valor a introducir:");
					respuesta4 = sc.nextInt();
					numeros.add((respuesta3 - 1), respuesta4);
				} else {
					System.err.println("Ese número es mayor al tamaño del ArrayList");
				}
				break;
			
			case 4:
				System.out.println("Gracias por usar mi menú morrocotudo, compañerete");
				break;

			default:
				System.err.println("Ese número no es válido compañerete");
				break;
			}

		} while (respuesta != 4);

		sc.close();
	}

}
