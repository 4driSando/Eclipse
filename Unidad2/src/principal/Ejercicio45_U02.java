package principal;

import java.util.Scanner;

public class Ejercicio45_U02 {

	public static void main(String[] args) {

		int num = 0;
		long num2 = 1;
		int contador = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número para factorizar");
		num = sc.nextInt();

	       do {
	            num2 *= contador;
	            System.out.println(contador + "! = " + num2);
	            contador++;
	        } while (contador <= num);
	}
}
