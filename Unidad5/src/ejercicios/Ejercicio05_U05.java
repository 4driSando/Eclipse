package ejercicios;

import java.util.Scanner;

import ejercicios.morrocodutils.arrays;

public class Ejercicio05_U05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamanio, relleno;
		
		System.out.println("ARRAY MORROCOTUDO BIEN RELLENITO");
		System.out.println("--------------------------------");
		System.out.println("Introduzca un valor para el tamaño del array");
		tamanio = sc.nextInt();
		System.out.println("Introduzca un valor con el que rellenar el array");
		relleno = sc.nextInt();
		
		int array1[] = new int[tamanio];
		
		for(int i = 0; i < tamanio; i++) {
			array1[i] = relleno;
		}

		arrays.mostrarArray(array1);
		
		sc.close();
	}

}
