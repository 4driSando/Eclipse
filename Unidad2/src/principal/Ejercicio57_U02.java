package principal;

import java.util.*;

public class Ejercicio57_U02 {

	public static void main(String[] args) {

		int P, Q;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce dos valores");
		System.out.print("Número P: ");
		P = sc.nextInt();
		System.out.print("Número Q: ");
		Q = sc.nextInt();

		int tamaño = (Q - P + 1);
		int[] lista = new int[tamaño];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = P++;
		}

		System.out.println("Valores del array:");
		System.out.print("| ");

		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " | ");
		}

	}
}