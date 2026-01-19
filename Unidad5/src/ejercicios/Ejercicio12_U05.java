package ejercicios;

import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio12_U05 {

	public static void main(String[] args) {

		int[] array1 = new int[15];
		int respuesta;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 15; i++) {
			System.out.println("Introduzca un número (Posición nº " + i + ")");
			respuesta = sc.nextInt();
			array1[i] = respuesta;
		}

		SandoArrays.mostrarArray(array1);

		int ultimoNumero = array1[array1.length - 1];

		for (int i = array1.length - 1; i > 0; i--) {
			array1[i] = array1[i - 1];
		}
		array1[0] = ultimoNumero;

		SandoArrays.mostrarArray(array1);

		sc.close();
	}

}
