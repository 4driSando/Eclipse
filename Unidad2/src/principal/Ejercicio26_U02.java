package principal;

import java.util.Scanner;

public class Ejercicio26_U02 {

	public static void main(String[] args) {

		int base, exp;
		int res = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame una base y un exponente para calcularte su potencia:");
		System.out.println("Base:");
		base = sc.nextInt();

		System.out.println("Exponente:");
		exp = sc.nextInt();

		for (int num = 0; num < exp; num++) {
			res *= base;
		}
		System.out.println("El resultado es " + res);
	}

}