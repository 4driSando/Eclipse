package ejercicios;

import java.util.Scanner;
import ejercicios.morrocodutils.arrays;

public class Ejercicio02_U05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int personas;

		System.out.println("ALTURAS MORROCOTUDAS");
		System.out.println("¿A cuántas personas quieres guardarle la altura?");
		personas = sc.nextInt();
		double alturas[] = new double[personas];

		for (int i = 0; i < personas; i++) {
			System.out.println("Persona nº" + (i + 1));
			alturas[i] = sc.nextDouble();
		}

		System.out.println("Aquí están los datos obtenidos:");
		System.out.println("La altura más pequeña es " + arrays.minimoArray(alturas));
		System.out.println("La altura más grande es " + arrays.maximoArray(alturas));
		System.out.println("La media de alturas es " + arrays.mediaArray(alturas));
		
		sc.close();
	}

}
