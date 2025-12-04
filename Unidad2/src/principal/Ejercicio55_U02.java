package principal;

import java.util.Scanner;

public class Ejercicio55_U02 {

	public static void main(String[] args) {

		int[] nums = new int[8];
		int suma = 0;
		int resta = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 8 números para sumarlos");

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Nº " + (i + 1));
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				suma += nums[i];
			} else if (nums[i] > 0) {
				resta += nums[i];
			}
		}
		System.out.println("La suma total de todos los números postivos es " + suma);
		System.out.println("La suma total de todos los números negativos es " + resta);

	}

}