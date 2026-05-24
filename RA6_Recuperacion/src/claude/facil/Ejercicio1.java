package claude.facil;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Generar array aleatorio
		
		int[] array = generaArray(10, 8, 50);
		
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	public static int[] generaArray(int numero, int min, int max) {
		int[] array = new int[numero]; 
		
		for (int i = 0; i < array.length; i++) {
			int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
			array[i] = aleatorio;
		}
		
		return array;
	}

}
