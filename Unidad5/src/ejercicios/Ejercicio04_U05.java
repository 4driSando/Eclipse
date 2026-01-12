package ejercicios;

import java.util.Scanner;

import ejercicios.morrocodutils.arrays;

public class Ejercicio04_U05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valorInicial, incremento, tamanio;
		
		System.out.println("SECUENCIAS ARITMÉTICAS MORROCOTUDAS");
		System.out.println("-----------------------------------");
		System.out.println("Introduzca un valor inicial");
		valorInicial = sc.nextInt();
		System.out.println("Introduzca un incremento");
		incremento = sc.nextInt();
		System.out.println("Introduzca cuántas veces quiere que se incremente");
		tamanio = sc.nextInt();
		
		int array1[] = new int[tamanio];
		array1[0] = valorInicial;
		
		for (int i = 1; i < tamanio; i++) {
			array1[i] = array1[i-1] + incremento;
		}	
		
		arrays.mostrarArray(array1);
		
		sc.close();
	}

}
