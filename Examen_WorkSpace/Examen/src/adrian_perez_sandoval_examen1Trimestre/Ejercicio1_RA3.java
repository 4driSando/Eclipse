package adrian_perez_sandoval_examen1Trimestre;

import java.util.Scanner;

public class Ejercicio1_RA3 {

	public static void main(String[] args) {
		/*
		 * pedir al usuario un entero determinar si es un entero perfecto imprimir si es
		 * perfecto o no
		 */

		int num, contadorPerfecto = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para saber si es un número perfecto o no");
		num = sc.nextInt();

		// Con este for comprobamos cada uno de los divisores y si su módulo es igual a 0, lo sumamos
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				contadorPerfecto += i;
			}
		}
		
		// Si la suma del contador es igual al número introducido será un número perfecto, si no es igual, pues no es un número perfecto
		if (contadorPerfecto == num) {
			System.out.println("El número " + num + " es un número perfecto");
		} else {
			System.out.println("El número " + num + " no es un número perfecto");
		}
	}

}