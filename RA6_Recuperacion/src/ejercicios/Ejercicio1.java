package ejercicios;

import java.util.ArrayList;

import ejercicios.utiles.SandoUtiles;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<Integer> array1 = SandoUtiles.generaArrayListAleatorio(10, 1, 20);
		ArrayList<Integer> yarra = SandoUtiles.volteaArray(array1);
		int minimoArray1 = SandoUtiles.minimoArrayListInteger(array1);
		int mediaArray1 = SandoUtiles.mediaArrayListInteger(array1);
		boolean diecinueve = SandoUtiles.estaEnArray(array1, 19);
		int posicion = SandoUtiles.posicionNumero(array1, 19);

		System.out.println("Array aleatorio: " + array1);
		System.out.println("Valor mínimo: " + minimoArray1);

		System.out.print("Media: ");
		int total = 0;
		for (int i = 0; i < array1.size(); i++) {
			total += array1.get(i);
			System.out.print(total + " -> ");
		}

		System.out.println(total + " / " + array1.size() + " = " + mediaArray1);
		System.out.println("Está el 19? " + diecinueve+ ". Última posición: " + posicion);
		
		System.out.println("Array volteado: " + yarra);
	}

}
