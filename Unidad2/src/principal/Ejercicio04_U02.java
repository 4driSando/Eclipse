package principal;

import java.util.Scanner;

public class Ejercicio04_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduce dos números para restar");
		System.out.println("Número 1:");
		num1 = sc.nextInt();
		System.out.println("Número 2:");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El resultado de su resta es " + (num1 - num2));
		} else {
			System.out.println("El resultado de su resta es " + (num2 - num1));

		}
	}

}
