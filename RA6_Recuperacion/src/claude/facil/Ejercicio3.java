package claude.facil;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Mínimo y mámimo de un array

		int[] array = claude.facil.Ejercicio1.generaArray(4, 1, 5);

		for (int i : array) {
			System.out.print(i + " ");
		}
		
		minYMax(array);
	}
	
	public static void minYMax(int[] array) {
		
		int min = array[0];
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] < min) {
		        min = array[i];
		    }
		    if (array[i] > max) {
		        max = array[i];
		    }
		}
		System.out.println("\nMínimo: " + min + " | Máximo: " + max);
	}

}
