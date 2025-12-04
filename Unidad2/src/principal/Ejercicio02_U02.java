package principal;

import java.util.Scanner;

public class Ejercicio02_U02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduce dos números y te digo cuál es mayor");
		
		System.out.println("Número 1:");
		num1 = sc.nextInt();
		
		System.out.println("Número 2:");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num2 + " es mayor que " + num1);
		}

	}
}
