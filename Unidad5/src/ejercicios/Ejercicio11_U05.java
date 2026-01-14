package ejercicios;

import java.util.Arrays;

import ejercicios.morrocodutils.SandoArrays;

public class Ejercicio11_U05 {

	public static void main(String[] args) {
	
		int[] numero = SandoArrays.generaArray(30, 0, 100);
		int[] cuadrado = new int[30];
		int[] cubo = new int[30];
		
		Arrays.sort(numero);
		
		for(int i = 0; i < 30; i++) {
			cuadrado[i] = (numero[i] * numero[i]);
		}

		for(int i = 0; i < 30; i++) {
			cubo[i] = (numero[i] * numero[i] * numero[i]);
		}
		
		System.out.println("Número | Cuadrado | Cubo");
		for(int i = 0; i < 30; i++) {
			System.out.print(numero[i] + " | " + cuadrado[i] + " | " + cubo[i]);
			System.out.println();
		}
	}

}
