package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio09_U05 {

	public static void main(String[] args) {
		/**
		 * 9. Necesitamos crear un programa para mostrar el ranking de puntuaciones de
		 * un torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca
		 * las puntuaciones de todos los jugadores (habitualmente valores entre 1000 y
		 * 2800, de tipo entero) y luego muestre las puntuaciones en orden descendente
		 * (de la más alta a la más baja).
		 */
		
		int[] jugadores = new int[8];
		int respuesta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TORNEO CHESS MORRCOTUDO");
		System.out.println("Introduzca las puntuaciones de los 8 jugadores (de 1000 a 2800)");
		
		for(int i = 0; i < 8; i++) {
			System.out.println("Jugador nº" + (i+1));
			respuesta = sc.nextInt();
			jugadores[i] = respuesta;
		}
		
		Arrays.sort(jugadores);
		System.out.println("El ranking de los jugadores es ");
		SandoArrays.mostrarArray2(SandoArrays.volteaArray(jugadores));
		
		sc.close();
	}

}
