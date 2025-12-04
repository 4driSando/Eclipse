package principal;

import java.util.Scanner;

public class Ejercicio64_U02 {

	/**
	 * Función utilizada para recoger el double precio y devolverlo calculando su IVA
	 * @param precio
	 * @return precio+21%
	 */
	
	public static double precioConIVA(double precio) {

		return precio * 1.21;
	}

	public static void main(String[] args) {

		double[] precio = new double[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce cinco precios para saber su IVA del 21%");

		for (int i = 0; i < precio.length; i++) {
			System.out.print("Precio nº " + (i + 1) + ": ");
			precio[i] = sc.nextDouble();
		}

		System.out.println("------------------------------------");
		System.out.println("El precio con el IVA es el siguente:");
		for (int i = 0; i < precio.length; i++) {
			System.out.println("Precio nº " + (i + 1) + ": " +precioConIVA(precio[i]));
		}
	}
}
