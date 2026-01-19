package ejercicios;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio18_U05 {

	public static void main(String[] args) {
		
		int[][] tablas = new int[10][10];
		
		for (int fila = 0; fila < tablas.length; fila++) {
		    for (int columna = 0; columna < tablas[fila].length; columna++) {
		        tablas[fila][columna] = (fila + 1) * (columna + 1);
		    }
		}
		
		SandoArrays.mostrarArraysMultidimensionales(tablas);

	}

}
