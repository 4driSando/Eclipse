package principal;

import java.util.Scanner;

public class Ejercicio05_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduce dos números para ordenar");
		System.out.println("Número 1:");
		num1 = sc.nextInt();
		System.out.println("Número 2:");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Tus números ordenados son " + num1 + " , " + num2);
		} else {
			System.out.println("Tus números ordenador son " + num2 + " , " + num1);
		}

	}
}