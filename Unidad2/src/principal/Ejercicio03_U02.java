package principal;

import java.util.Scanner;

public class Ejercicio03_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.println("Escribe un número y sabrás si es par y/o divisible entre 5:");
		num1 = sc.nextInt();
		
		if (num1 % 2 == 0 && num1 % 5 == 0) {
			System.out.println("Tu número es par y divisible entre 5.");
		} else if (num1 % 2 == 0) {
			System.out.println("Tu número es par pero no divisible entre 5.");
		} else if (num1 % 5 == 0) {
			System.out.println("Tu número no es par pero sí divisible entre 5.");
		} else {
			System.out.println("Tu número no es par ni divisible entre 5.");
		}
	}

}
