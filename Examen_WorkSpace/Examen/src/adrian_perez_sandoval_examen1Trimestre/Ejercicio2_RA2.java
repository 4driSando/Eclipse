package adrian_perez_sandoval_examen1Trimestre;

import java.util.Scanner;

public class Ejercicio2_RA2 {

	public static void main(String[] args) {
		/*
		 * Pedir 3 números enteros Función para determinar cuál es el mayor de los tres
		 * números Programa imprime el número mayor por consola
		 */

		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tres números:");
		System.out.print("Primer número: ");
		num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Tercer número: ");
		num3 = sc.nextInt();

		System.out.println("El número mayor es " + numeroMayor(num1, num2, num3));
	}


	/**
	 * Función que determina cuál es el mayor de los tres enteros pedidos por
	 * scanner
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return númeroMayor de los 3
	 */
	
	public static int numeroMayor(int num1, int num2, int num3) {
		int numM = 0;
		if (num1 >= num2 && num1 >= num3) {
			numM = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			numM = num2;
		} else if (num3 >= num1 && num3 >= num2) {
			numM = num3;
		}
		return numM;
	}
}
//	public static int numeroMayor(int num1, int num2, int num3) {
//		if (num1 > num2 && num1 > num3) {
//			return num1;
//		} else if (num2 > num1 && num2 > num3) {
//			return num2;
//		} else {
//			return num3;
//		}
//	}
//}
