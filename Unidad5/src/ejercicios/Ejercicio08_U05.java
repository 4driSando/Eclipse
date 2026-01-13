package ejercicios;

import java.util.Arrays;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio08_U05 {

	public static void main(String[] args) {

		int[] array1 = new int[30];
        
		for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
		
		Arrays.sort(array1);
		
		SandoArrays.mostrarArray(array1);

	}

}
