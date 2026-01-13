package ejercicios;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio01_U05 {

	public static void main(String[] args) {

		int[] array1 = SandoArrays.generaArray(10, 0, 100);
		int[] yarra = SandoArrays.volteaArray(array1);
		
		int num = (int) (Math.random()*100 - 1);
		
		System.out.print("| ");
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " | ");
		}		
		
		System.out.println("\nEl número más pequeño es " + SandoArrays.minimoArray(array1));
		System.out.println("El número más grande es " + SandoArrays.maximoArray(array1));
		System.out.println("La media de los números es " + SandoArrays.mediaArray(array1));
		System.out.println("El número " + num + " está?: " + SandoArrays.estaEnArray(array1, num));
		System.out.println("El número " + num + " está en la posición " + SandoArrays.posicionEnArray(array1, num));
		
		System.out.print("| ");
		for(int i = 0; i < yarra.length; i++) {
			System.out.print(yarra[i] + " | ");
		}	
	
	}

}
