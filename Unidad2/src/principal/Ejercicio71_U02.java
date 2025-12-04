package principal;

import java.util.Scanner;

public class Ejercicio71_U02 {

	public static void main(String[] args) {
		/*
		 * Realiza una función que calcule el factorial de un número. En el programa, se
		 * solicitará al usuario el número sobre el que quiere calcular el factorial (el
		 * método solo realiza el factorial, no interacciona con el usuario)
		 * 
		 * Función para calcular factorial pedir número mostar función con el factorial
		 * q pide al usuario
		 * 
		 */

		int numSc, num = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para calcular su factorial");
		numSc = sc.nextInt();
		System.out.println(numSc+ "!= " + factorial(num, numSc));
	}

	public static int factorial(int num, int numSc) {
		for (int i = 0; i < numSc; i++) {
			num *= (i + 1);
		}
		return num;
	}

}
