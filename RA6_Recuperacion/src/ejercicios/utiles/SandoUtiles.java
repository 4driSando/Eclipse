package ejercicios.utiles;

import java.util.ArrayList;

public class SandoUtiles {

	/**
	 * Genera un arrayList de números aleatorios en base a 3 parámetros
	 * 
	 * @param cantidad número de tamaño del arrayList
	 * @param minimo   número random como mínimo
	 * @param maximo   número random como máximo
	 * @return arrayList relleno
	 */
	public static ArrayList<Integer> generaArrayListAleatorio(int cantidad, int minimo, int maximo) {

		// Declaro el array que se va a rellenar
		ArrayList<Integer> arrayAleatorio = new ArrayList<Integer>();

		// Relleno el array posición por posición
		for (int i = 0; i < cantidad; i++) {
			int aleatorio = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
			arrayAleatorio.add(aleatorio);
		}

		// Devuelvo el array
		return arrayAleatorio;
	}

	/**
	 * Encuentra el mínimo valor de todo el arrayList que se le ha pasado por
	 * parámetro
	 * 
	 * @param array arrayList en el que se va a buscar el mínimo valor
	 * @return valor más pequeño de todo el arrayList
	 */
	public static int minimoArrayListInteger(ArrayList<Integer> array) {

		// Recojo el primer valor de la lista
		int min = array.get(0);

		// Recorro el arrayList
		for (int i = 0; i < array.size(); i++) {

			// Si el valor en la posición i es menor
			if (array.get(i) < min) {

				// Cambia el valor de i por un valor menor
				min = array.get(i);
			}
		}

		// Devuelvo el valor minimo
		return min;
	}
	
	public static double minimoArrayListDouble(ArrayList<Double> arrayList) {
		double min = arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) < min) {
				min = arrayList.get(i);
			}
		}
		return min;
	}

	/**
	 * Encuentra el máximo valor de todo el arrayList que se le ha pasado por
	 * parámetro
	 * 
	 * @param array arrayList en el que se va a buscar el mínimo valor
	 * @return valor más grande de todo el arrayList
	 */
	public static int maximoArrayListInteger(ArrayList<Integer> array) {

		// Recojo el primer valor de la lista
		int max = array.get(0);

		// Recorro el arrayList
		for (int i = 0; i < array.size(); i++) {

			// Si el valor en la posición i es menor
			if (array.get(i) > max) {

				// Cambia el valor de i por un valor menor
				max = array.get(i);
			}
		}

		// Devuelvo el valor minimo
		return max;
	}
	
	public static double maximoArrayListDouble(ArrayList<Double> arrayList) {
		double max = arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) > max) {
				max = arrayList.get(i);
			}
		}
		return max;
	}

	/**
	 * Calcula la media de la suma de todos los valores del array
	 * 
	 * @param array arrayList en el que se va a calcular la media
	 * @return double con la media
	 */
	public static int mediaArrayListInteger(ArrayList<Integer> array) {

		// Declaro los enteros que me van a hacer falta
		int total = 0;

		// Recorro el arrayList
		for (int i = 0; i < array.size(); i++) {

			// Voy sumando y recogiendo en total la suma de los valores índice por índice
			total += array.get(i);

		}

		// Divido el total con el tamaño del arrayList
		int media = total / array.size();

		// Devuelvo la media
		return media;
	}
	
	public static double mediaArrayListDouble(ArrayList<Double> arrayList) {
		double media, suma = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			suma += arrayList.get(i);
		}
		media = suma / arrayList.size();

		return media;
	}

	/**
	 * Boolean que devuelve sin un número se encuentra en el array
	 * 
	 * @param array         arrayList en el que se buscará el número
	 * @param numeroABuscar número que se quiere encontrar
	 * @return true o false dependiendo de si lo ha encontrado o no
	 */
	public static boolean estaEnArray(ArrayList<Integer> array, int numeroABuscar) {

		// Declaro un boolean para encontrar el número
		boolean encontrado = false;

		// Recorro el arrayList
		for (int i = 0; i < array.size(); i++) {

			// Si el numero a buscar coincide con el número de la posición del índice
			if (array.get(i) == numeroABuscar) {

				// A encontrado se le cambia a true
				encontrado = true;
			}
		}

		// Devuelvo el boolean
		return encontrado;
	}

	/**
	 * Busca y devuelve la posición de x número en un array
	 * 
	 * @param array         arrayList en el que se va a buscar
	 * @param numeroABuscar número del que se quiere saber la posición
	 * @return la posición del número, [-1] en caso de no encontrar nada
	 */
	public static int posicionNumero(ArrayList<Integer> array, int numeroABuscar) {

		// Declaro una variable para guardar la posición
		int posEncontrado = -1;

		// Recorro el arrayList
		for (int i = 0; i < array.size(); i++) {

			// Si el numero a buscar coincide con el número de la posición del índice
			if (array.get(i) == numeroABuscar) {

				// Cambio el valor de la variable por el valor del índice en esa posición
				posEncontrado = i;
			}
		}

		// Devuelvo ls posición, [-1] si no lo encuentra
		return posEncontrado;
	}
	
	/**
	 * Recorre un arrayList y genera otro volteado
	 * 
	 * @param array arrayList que se va a voltear
	 * @return arrayList volteado
	 */
	public static ArrayList<Integer> volteaArray(ArrayList<Integer> array) {

		// Declaro el array que se va a rellenar con el otro array
		ArrayList<Integer> yarra = new ArrayList<Integer>();

		// Relleno el array volteado posición por posición
	    for (int i = array.size() - 1; i >= 0; i--) {
			
			// Añado al array volteado el valor de la posición
			yarra.add(array.get(i));
		}

		// Devuelvo el array
		return yarra;
	}

}
