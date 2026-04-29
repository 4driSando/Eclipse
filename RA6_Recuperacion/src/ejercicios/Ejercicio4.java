package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Crear secuencia aritmética");
		System.out.println("Valor inicial:");
		int v = sc.nextInt();
		System.out.println("Incremento:");
		int i = sc.nextInt();
		System.out.println("Valores a crear:");
		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			array.add(v);
			v = v + i;
		}

		System.out.println(array);
		sc.close();
	}

}
