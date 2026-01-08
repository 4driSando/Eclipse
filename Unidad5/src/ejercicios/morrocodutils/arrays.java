package ejercicios.morrocodutils;

public class arrays {

	/**
	 * Método que genera un array
	 * @param num = número de enteros random que va a guardar
	 * @param min = mínimo random
	 * @param max = máximo random
	 * @return array creado y rellenado con enteros random
	 */
	public static int[] generaArray(int num, int min, int max) {
		int[] array = new int[num];

		for (int i = 0; i < num; i++) {
			array[i] = (int)(Math.random() * (max - min + 1)) + min;
		}
		return array;
	}

	/**
	 * @param array
	 * @return entero más pequeño del array
	 */
	public static int minimoArray(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * @param array
	 * @return entero más grande del array
	 */
	public static int maximoArray(int[] array) {
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * @param array
	 * @return media de todos los enteros que conforman el array
	 */
	public static double mediaArray(int[] array) {
		double media, suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;

		return media;
	}

	/**
	 * Comprueba si el número introducido está o no en el array
	 * @param array
	 * @param num = número que queremos comprobar
	 * @return true o false
	 */
	public static boolean estaEnArray(int[] array, int num) {
		boolean estaEn = false;

		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				estaEn = true;
			}
		}
		return estaEn;
	}

	/**
	 * Comprueba las posiciones del array
	 * @param array
	 * @param num = número que queremos saber en qué posición está
	 * @return la posición donde se encuentra el número introducido
	 */
	public static int posicionEnArray(int[] array, int num) {
		int posicion = -1;

		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				posicion = i + 1;
			}			
		}
		return posicion;
	}
	
	/**
	 * Voltea el array introducido
	 * @param array
	 * @return devuelve otro array pero invertido
	 */
	public static int[] volteaArray(int[] array) {
	    int[] yarra = new int[array.length];

	    for (int i = 0; i < array.length; i++) {
	        yarra[i] = array[array.length - 1 - i];
	    }
	    return yarra;
	}

}
