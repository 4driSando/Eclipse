package principal;

import java.util.Scanner;

public class Ejercicio27_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String noprimo = " no es un número primo";

		System.out.println("Introduce un número para ver si es primo: ");
		num = sc.nextInt();

		if (num == 2 || num == 3 || num == 5) {
			System.out.println(num + " es un número primo");
		} else if (num % 2 == 0) {
			System.out.println(num + noprimo);
		} else if (num % 3 == 0) {
			System.out.println(num + noprimo);
		} else if (num % 5 == 0) {
			System.out.println(num + noprimo);
		} else {
			System.out.println(num + " es un número primo");
		}
	}
}