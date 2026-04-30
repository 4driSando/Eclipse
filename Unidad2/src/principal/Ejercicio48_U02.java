package principal;

import java.util.*;

public class Ejercicio48_U02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		System.out.println("Introduce 10 números para mostrarlos en orden inverso");
		for(int i = 0; i < num.length; i++) {
			System.out.println("Número " +i + ": ");
			num[i] = sc.nextInt();
		}

		for(int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " | ");
		}
		
		sc.close();
		
	}
}