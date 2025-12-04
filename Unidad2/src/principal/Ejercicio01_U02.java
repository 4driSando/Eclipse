package principal;

import java.util.Scanner;

public class Ejercicio01_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Introduce un número y te diré si es positivo o negativo");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("Tu número es positivo!!");
		} else {
			System.out.println("Tu número es negativo!!");
		}

	}

}
