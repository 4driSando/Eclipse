package ejercicios;

import ejercicios.morrocodutils.Clase40;

public class Ejercicio01_U04 {

	public static void main(String[] args) {

		int num = 21, num2 = 6;

		System.out.println("==================================================");
		for (int i = num; i >= 0; i = Clase40.imprimePares(i)) {
		    System.out.println("- " + i);
		}
		System.out.println("==================================================");
		for (int i = 1; i < 11; i++) {
			System.out.println(i +" x "+ num2 +" = " + Clase40.tablaMultiplicar(num2, i));
		}
		System.out.println("==================================================");
		Clase40.mostrarFibonacci(10);
		System.out.println("==================================================");
		System.out.println("El área del rectángulo es " + Clase40.areaRectangulo(10.25, 5.5));
		System.out.println("El área del rectángulo sobrecargado es " + Clase40.areaRectangulo(12.75));
		System.out.println("==================================================");
		System.out.println("La fecha es " + Clase40.esFechaCorrecta(25, 9, 2025));

	}

}
