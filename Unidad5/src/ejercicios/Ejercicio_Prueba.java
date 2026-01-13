package ejercicios;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio_Prueba {

	public static void main(String[] args) {

		int elemento = 7;
		int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10};
		
		int elemento2 = 3;
		int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		SandoArrays.mostrarArray(array1);
		
		System.out.println("El número " + elemento + " está en la posicion " + SandoArrays.busquedaDicotomica(array1, elemento));
		
		SandoArrays.mostrarArray(array2);
		
		System.out.println("El número " + elemento2 + " está en la posicion " + SandoArrays.busquedaDicotomica(array2, elemento2));
	}

}
