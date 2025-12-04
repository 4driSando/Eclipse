package principal;

import java.util.Scanner;

public class Ejercicio63_U02 {

	/**
	 * Función utilizada para recoger dos datos y devolver el menor de ellos
	 * @param num1
	 * @param num2
	 * @return minimo(num1, num2)
	 */
	
	public static int minimo(int num1, int num2) {
		
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos números para saber el menor de los dos:");
		System.out.print("Número 1: ");
		num1 = sc.nextInt();
		System.out.print("Número 2: ");
		num2 = sc.nextInt();
		
		System.out.println("El resultado más pequeño es " + minimo(num1, num2));
	}

}
