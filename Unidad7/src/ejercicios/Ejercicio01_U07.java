package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01_U07 {

	public static void main(String[] args) {
		/**
		 * Implementa un programa que pida al usuario un valor entero A utilizando un
		 * nextInt() y luego muestre por pantalla el mensaje “Valor introducido: …”. Se
		 * deberá tratar la excepción InputMismatchException que lanza nextInt() cuando
		 * no se introduce un entero válido. En tal caso se mostrará el mensaje “Valor
		 * introducido incorrecto”.
		 */

		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("Introduce un número morrocotudo");
		try {
			a = sc.nextInt();
			System.out.println("El valor introducido es " + a);
		} catch (InputMismatchException e) {
			System.err.println("Ese valor no es un entero, compañerete");
		}
		sc.close();
	}

}
