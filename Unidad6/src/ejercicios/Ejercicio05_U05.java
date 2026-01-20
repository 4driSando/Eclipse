package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05_U05 {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int respuesta;

		System.out.println("ArrayList MORROCOTUDO");
		System.out.println("---------------------");
		System.out.println("Introduzca valores para almacenar");

		do {
			System.out.println("Valor posición " + array.size());
			respuesta = sc.nextInt();
			array.add(respuesta);
		} while (respuesta != -1);

		System.out.println(array);
		sc.close();
	}

}
