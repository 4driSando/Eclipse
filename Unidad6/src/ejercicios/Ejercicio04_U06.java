package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04_U06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valorInicial, incremento, tamanio;
		ArrayList<Integer> secuencia = new ArrayList<>();

		System.out.println("SECUENCIAS ARITMÉTICAS MORROCOTUDAS");
		System.out.println("-----------------------------------");
		System.out.println("Introduzca un valor inicial");
		valorInicial = sc.nextInt();
		System.out.println("Introduzca un incremento");
		incremento = sc.nextInt();
		System.out.println("Introduzca cuántas veces quiere que se incremente");
		tamanio = sc.nextInt();

		secuencia.add(0, valorInicial);

		for (int i = 1; i < (tamanio + 1); i++) {
			secuencia.add(secuencia.get(i - 1) + incremento);
		}

		System.out.println(secuencia);

		sc.close();
	}

}
