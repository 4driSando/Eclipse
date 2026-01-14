package ejercicios;

import java.util.Arrays;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio08_U05 {

	public static void main(String[] args) {

		int[] array1 = SandoArrays.generaArray(30, 0, 10);
		
		Arrays.sort(array1);
		
		SandoArrays.mostrarArray(array1);
		
	}

}
