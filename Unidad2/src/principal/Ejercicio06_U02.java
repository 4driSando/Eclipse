package principal;

import java.util.Scanner;

public class Ejercicio06_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Introduce tres números para ordenar");
		System.out.println("Número 1:");
		num1 = sc.nextInt();
		System.out.println("Número 2:");
		num2 = sc.nextInt();
		System.out.println("Número 3:");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El número más grande es " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El número más grande es " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("El número más grande es " + num3);
		} else {
			System.err.println("Todos los números son iguales");

		}
	}

}
