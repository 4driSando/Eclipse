package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicios.utiles.SandoUtiles;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Double> personas = new ArrayList<Double>();

		Scanner sc = new Scanner(System.in);
		double respuesta;
		int contadorPersonas = 1;

		do {

			System.out.println("Introduce una altura para persona nº" + contadorPersonas);
			respuesta = sc.nextDouble();
			if (respuesta < 2.1 && respuesta > 0) {
				personas.add(respuesta);
			} else {
				System.err.println("No creo que se pueda medir tanto, compañerete");
			}
			contadorPersonas++;

		} while (respuesta > 0);

		System.out.println("La media de las alturas es " + SandoUtiles.mediaArrayListDouble(personas));
		System.out.println("La altura máxima es " + SandoUtiles.maximoArrayListDouble(personas));
		System.out.println("La altura mínimo es " + SandoUtiles.minimoArrayListDouble(personas));

		sc.close();
	}
}
