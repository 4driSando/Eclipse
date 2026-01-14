package ejercicios.morrocodutils;

public class SandoArrays {

	/**
	 * Método que genera un array
	 * 
	 * @param num = número de enteros random que va a guardar
	 * @param min = mínimo random
	 * @param max = máximo random
	 * @return devuelve array creado y rellenado con enteros random
	 */
	public static int[] generaArray(int num, int min, int max) {
		int[] array = new int[num];

		for (int i = 0; i < num; i++) {
			array[i] = (int) (Math.random() * (max - min + 1)) + min;
		}
		return array;
	}

	/**
	 * @param array
	 * @return devuelve el entero más pequeño del array
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

	public static double minimoArray(double[] array) {
		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * @param array
	 * @return devuelve el entero más grande del array
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

	public static double maximoArray(double[] array) {
		double max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * @param array
	 * @return devuelve la media de todos los enteros que conforman el array
	 */
	public static double mediaArray(int[] array) {
		double media, suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;

		return media;
	}

	public static double mediaArray(double[] array) {
		double media, suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		media = suma / array.length;

		return media;
	}

	/**
	 * Comprueba si el número introducido está o no en el array
	 * 
	 * @param array
	 * @param num   = número que queremos comprobar
	 * @return devuelve true o false
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
	 * 
	 * @param array
	 * @param num   = número que queremos saber en qué posición está
	 * @return devuelve la posición donde se encuentra el número introducido
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
	 * 
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

	/**
	 * Método para hacer una busqueda binaria/dicotomica en un array
	 * 
	 * @param array1   = array ordenado en el que se va a buscar
	 * @param elemento = elemento del array el cuál se busca
	 * @return devuelve la posicion del elemento en el array
	 */
	public static int busquedaDicotomica(int[] array1, int elemento) {
		int izq = 0;
		int der = array1.length - 1;
		int centro = (izq + der) / 2;
		int posicion = -1;

		while (izq <= der && array1[centro] != elemento) {
			if (elemento < centro) {
				der = centro - 1;
			} else {
				izq = centro + 1;
			}
			centro = (izq + der) / 2;

			if (izq > der) {
				posicion = -1;
			} else {
				posicion = centro;
			}

		}
		return posicion;
	}

	/***
	 * Método para mostrar un array | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
	 * @param array1
	 */
	public static void mostrarArray(int[] array1) {
		System.out.print("| ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " | ");
		}
		System.out.println("");
	}

	public static void mostrarArray(double[] array1) {
		System.out.print("| ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " | ");
		}
		System.out.println("");
	}
	
	/***
	 * Método para mostrar un array a modo de lista
	 * @param array1
	 */
	public static void mostrarArray2(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print((i+1) + ". " +array1[i]);
			System.out.println("");
		}
		System.out.println("");
	}

}
