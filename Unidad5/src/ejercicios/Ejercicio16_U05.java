package ejercicios;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio16_U05 {

	public static void main(String[] args) {

		int[][] array1 = new int[5][5];
		int contador = 1;

		for (int fila = 0; fila < array1.length; fila++) {
			for (int columna = 0; columna < array1[fila].length; columna++) {
				array1[fila][columna] = contador++;
			}
		}
		
		SandoArrays.mostrarArraysMultidimensionales(array1);
	}
}
