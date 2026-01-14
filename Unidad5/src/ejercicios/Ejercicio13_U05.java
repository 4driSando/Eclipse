package ejercicios;

import java.util.Scanner;
import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio13_U05 {

	public static void main(String[] args) {

		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		int[] array1 = SandoArrays.generaArray(100, 0, 20);

		System.out.println("ARRAY GENERADO");
		SandoArrays.mostrarArray(array1);

		System.out.println("Primer número a cambiar:");
		numero1 = sc.nextInt();
		System.out.println("Segundo número:");
		numero2 = sc.nextInt();

		System.out.print("| ");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == numero1) {
				System.out.print("\"" + numero2 + "\" | ");
			} else {
				System.out.print(array1[i] + " | ");
			}
		}
	}
}
