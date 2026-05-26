package claude.facil;

import java.util.Iterator;

public class Ejercicio4 {
	
	public static void main(String[] args) {

		int[] array = Ejercicio1.generaArray(4, 1, 5);

		for (int i : array) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		int[] array2 = invertirArray(array);
		
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
	}
	
	public static int[] invertirArray(int[] array) {
		int[] array2 = new int[array.length];
		int j = 0;
		
		for (int i = array.length - 1; i >= 0; i--) {
			array2[j] = array[i];
			j++;
		}
		
		return array2;
	}

}
