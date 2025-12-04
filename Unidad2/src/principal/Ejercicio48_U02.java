package principal;

import java.util.*;

public class Ejercicio48_U02 {

	public static void main(String[] args) {

		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce 10 números para mostrarlos en orden inverso");
		for(int i = 0; i < num.length; i++) {
			System.out.println("Nº " +i);
			num[i] = sc.nextInt();
		}
				
		System.out.print("| ");
		
		for (int j = num.length - 1; j >= 0; j--) {
			System.out.print(num[j] + " | ");
		}
	}
}