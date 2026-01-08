package ejercicios;

import ejercicios.morrocodutils.arrays;

public class Ejercicio01_U05 {

	public static void main(String[] args) {

		int[] array1 = arrays.generaArray(10, 0, 100);
		int[] yarra = arrays.volteaArray(array1);
		
		int num = (int) (Math.random()*100 - 1);
		
		System.out.print("| ");
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " | ");
		}		
		
		System.out.println("\nEl número más pequeño es " + arrays.minimoArray(array1));
		System.out.println("El número más grande es " + arrays.maximoArray(array1));
		System.out.println("La media de los números es " + arrays.mediaArray(array1));
		System.out.println("El número " + num + " está?: " + arrays.estaEnArray(array1, num));
		System.out.println("El número " + num + " está en la posición " + arrays.posicionEnArray(array1, num));
		
		System.out.print("| ");
		for(int i = 0; i < yarra.length; i++) {
			System.out.print(yarra[i] + " | ");
		}	
	
	}

}
