package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio07_U05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int respuesta;

		System.out.println("Introduzca 20 números");
		System.out.println("---------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": 1er array");
			respuesta = sc.nextInt();
			array1[i] = respuesta;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Número " + (i + 1) + ": 2º array");
			respuesta = sc.nextInt();
			array2[i] = respuesta;
		}

		SandoArrays.mostrarArray(array1);
		SandoArrays.mostrarArray(array2);

		if (Arrays.compare(array1, array2) < 0) {
			System.out.println("Los arrays no son iguales");
		} else {
			System.out.println("Los arrays sí que son iguales");
		}

		sc.close();
	}
}
