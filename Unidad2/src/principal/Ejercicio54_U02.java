package principal;

import java.util.Scanner;

public class Ejercicio54_U02 {

	public static void main(String[] args) {

		/*
		 * Pedir 10 números 
		 * Almacenarlos en un array 
		 * Sumarlos
		 */

		int[] nums = new int[10];
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 números para sumarlos");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Nº " + (i + 1));
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		System.out.println("La suma total de todos los números es " + suma);

	}

}