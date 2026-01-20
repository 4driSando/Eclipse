package ejercicios;

import java.util.ArrayList;
import ejercicios.morrocodutils.SandoArrayLists;

public class Ejercicio01_U06 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = SandoArrayLists.generaArrayList(10, 1, 10);
		ArrayList<Integer> alReves = SandoArrayLists.volteaArray(numeros);
		int min = SandoArrayLists.minimoArrayList(numeros);
		int max = SandoArrayLists.maximoArrayList(numeros);
		double media = SandoArrayLists.mediaArray(numeros);
		int buscar = 5;
		boolean esta = SandoArrayLists.estaEnArray(numeros, buscar);
		int pos = SandoArrayLists.posicionEnArray(numeros, buscar);

		System.out.println("ArrayList generado: " + numeros);
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		System.out.println("Media: " + media);
		System.out.println("¿Está el " + buscar + " en el arrayList? " + esta);
		System.out.println("Posición del " + buscar + ": " + pos);
		System.out.println("ArrayList volteado: " + alReves);
	}
}
