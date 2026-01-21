package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicios.morrocodutils.SandoArrayLists;

public class Ejercicio02_U06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double respuesta;
		ArrayList<Double> alturas = new ArrayList<>();

		System.out.println("Cálculo de las alturas morrocotudas");
		do {
			System.out.println("Persona nº " + (alturas.size() + 1));
			respuesta = sc.nextDouble();
			if (respuesta < 2.1 && respuesta > 0) {
				alturas.add(respuesta);
			} else {
				System.err.println("No creo que se pueda medir tanto, compañerete");
			}
		} while (respuesta != 0);

		System.out.println("Las alturas son " + alturas);
		System.out.println("La altura media es " + SandoArrayLists.mediaArrayDouble(alturas));
		System.out.println("La altura mínima es " + SandoArrayLists.minimoArrayListDouble(alturas));
		System.out.println("La altura máxima es " + SandoArrayLists.maximoArrayListDouble(alturas));
		sc.close();
	}

}
