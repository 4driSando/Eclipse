package ejercicios.morrocodutils;

import java.util.ArrayList;

public class SandoArrayLists {

	/**
	 * Método que genera un arrayList con números aleatorios
	 * 
	 * @param num = número de enteros random que va a guardar
	 * @param min = mínimo random
	 * @param max = máximo random
	 * @return devuelve array creado y rellenado con enteros random
	 */
	public static ArrayList<Integer> generaArrayList(int num, int min, int max) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		int aleatorio = (int) (Math.random() * (max - min + 1)) + min;

		for (int i = 0; i < num; i++) {
			arrayList1.add(aleatorio);
		}
		return arrayList1;
	}

	/**
	 * @param arrayList
	 * @return devuelve el entero más pequeño del array
	 */
	public static int minimoArrayList(ArrayList<Integer> arrayList) {
		int min = arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) < min) {
				min = arrayList.get(i);
			}
		}
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
	 * @param arrayList
	 * @return devuelve el entero más grande del array
	 */
	public static int maximoArrayList(ArrayList<Integer> arrayList) {
		int max = arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) > max) {
				max = arrayList.get(i);
			}
		}
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
	 * @param arrayList
	 * @return devuelve la media de todos los enteros que conforman el arrayList
	 */
	public static double mediaArray(ArrayList<Integer> arrayList) {
		double media, suma = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			suma += arrayList.get(i);
		}
		media = suma / arrayList.size();

		return media;
	}

}
