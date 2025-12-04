package principal;

import java.util.Scanner;

public class Ejercicio42_U02 {

	public static void main(String[] args) {

		int num = 0;
		int suma = 0;
		int contador = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce números hasta que su suma sea igual o mayor que 50");

		do {
			System.out.println("Número + (" + suma + ")");
			num = sc.nextInt();
			suma += num;
			contador++;
		} while (suma < 50);
		System.out.println("La suma total es " + suma);
	}

}
