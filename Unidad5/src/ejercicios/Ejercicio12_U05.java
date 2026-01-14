package ejercicios;

import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio12_U05 {

	public static void main(String[] args) {
		/**
		 * 12. Escribe un programa que lea 15 números por teclado y que los almacene en
		 * un array. Rota los elementos de ese array, es decir, el elemento de la
		 * posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que
		 * se encuentra en la última posición debe pasar a la posición 0. Finalmente,
		 * muestra el contenido del array.
		 */

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

	}

}
