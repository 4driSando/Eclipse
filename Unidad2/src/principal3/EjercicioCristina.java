package principal3;

import java.util.Scanner;

public class EjercicioCristina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		int lengthArray = 0;
		int[] array1 = new int[lengthArray];

		System.out.println("¿Cuántos números desea ingresar?");
		num1 = sc.nextInt();

		for (int i = 0; i < num1; i++) {
			System.out.println("Introduce un número");
			num2 = sc.nextInt();
			System.out.println("¿Cuántas veces quiere repetirlo?");
			num3 = sc.nextInt();
			lengthArray += num3;
		}
		
	}
}
