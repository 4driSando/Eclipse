package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio45_U02 {

	public static void main(String[] args) {

		int num = 0;
		long num2 = 1;
		int contador = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número para factorizar");

		try {
			num = sc.nextInt();
	       do {
	            num2 *= contador;
	            System.out.println(contador + "! = " + num2);
	            contador++;
	        } while (contador <= num);
		} catch (InputMismatchException e) {
			System.err.println("Has introducido otro valor que no es un entero");
		}
		System.out.println("Fin del programa");
		sc.close();
	}
		
}
