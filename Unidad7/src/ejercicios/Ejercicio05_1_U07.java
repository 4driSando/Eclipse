package ejercicios;

import java.util.Scanner;

public class Ejercicio05_1_U07 {

	public static void main(String[] args) {

		int p;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		try {
			p = sc.nextInt();
			imprimeNegativo(p);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}

		sc.close();
	}

	static void imprimeNegativo(int p) throws ArithmeticException {
		if (p >= 0) {
			throw new ArithmeticException(p + " es mayor o igual a 0");
		} else {
			System.out.println(p + " es menor que 0");
		}
	}
}
