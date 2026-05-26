package claude.facil;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int[] array = Ejercicio1.generaArray(4, 1, 5);

		for (int i : array) {
			System.out.print(i + " ");
		}
		
		int[] array2 = arraySoloPares(array);
		System.out.println();
		
		for (int i : array2) {
			System.out.print(i + " ");
		}

	}
	
	public static int[] arraySoloPares(int[] array) {
		
		int[] array2 = new int[array.length];
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] % 2 == 0) {
				array2[j] = array[i];
				j++;
			}
		}
		return array2;
	
	}

}
