package ejercicios;

import ejercicios.morrocodutils.Clase40;

public class Ejercicio01_U04 {

	public static void main(String[] args) {

		int num1 = 20, num2 = 8, num3 = 10, ancho = 10, alto = 5, dia = 25, mes = 9, anio = 2025;

		Clase40.imprimePares(num1);
		System.out.println("==========");
		Clase40.tablaMultiplicar(num2);
		System.out.println("==========");
		Clase40.mostrarFibonacci(num3);
		System.out.println("==========");
		System.out.println("El área del rectángulo es " + Clase40.areaRectangulo(ancho, alto));
		System.out.println("==========");
		System.out.println("La fecha es " + Clase40.esFechaCorrecta(dia, mes, anio));

	}

}
