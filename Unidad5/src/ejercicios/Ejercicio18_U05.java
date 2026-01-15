package ejercicios;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio18_U05 {

	public static void main(String[] args) {
		/**
		 * 18. Crea un programa que cree una matriz de 10x10 e introduzca los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla en una fila). Luego
		 * mostrará la matriz por pantalla.
		 */
		
		int[][] tablas = new int[10][10];
		int contador = 1;
		
		for (int fila = 0; fila < tablas.length; fila++) {
			for (int columna = 0; columna < tablas[fila].length; columna++) {
				tablas[fila][columna] = contador*contador;
			}
		}
		
		SandoArrays.mostrarArraysMultidimensionales(tablas);

	}

}
