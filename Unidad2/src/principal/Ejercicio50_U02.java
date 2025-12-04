package principal;

import java.util.*;

public class Ejercicio50_U02 {

	public static void main(String[] args) {

		int[] num = new int[12];
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 12 números para saber si son pares o impares:");

		for (int i = 0; i < num.length; i++) {
			System.out.print("Nº " + (i + 1) + ": ");
			num[i] = sc.nextInt();
		}

		System.out.print("Pares: | ");
		for (int n : num) {
			if (n % 2 == 0)
				System.out.print(n + " | ");
		}
		
		System.out.println(" ");
		System.out.print("Impares: | ");
		for (int n : num) {
			if (n % 2 != 0)
				System.out.print(n + " | ");
		}
	}
}
