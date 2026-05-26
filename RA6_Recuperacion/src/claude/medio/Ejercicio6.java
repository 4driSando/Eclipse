package claude.medio;

import claude.facil.Ejercicio1;

public class Ejercicio6 {

	public static void main(String[] args) {

		
		// Mal fatal, la solución es fumada
		
		
		int[] array = Ejercicio1.generaArray(4, 1, 5);

		for (int i : array) {
			System.out.print(i + " ");
		}
		
		int[] array2 = bubbleSort(array);
		System.out.println();
		
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] bubbleSort(int[] array) {
		
		int[] array2 = new int[array.length];
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] < array[i+1]) {
				array2[j] = array[i];
				j++;
			} else {
				array2[j] = array[i+1];
				j++;
			}
		}
		
		return array2;
		
	}

}
