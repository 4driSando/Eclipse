package principal;

import java.util.Scanner;

public class Ejercicio65_U02 {

	/*
	 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por
	 * pantalla su área y su perímetro. Implementa y utiliza las funciones: double
	 * perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
	 * double areaRectangulo(double ancho, double alto) // Devuelve el área
	 */

	public static double perimetroRectangulo(double ancho, double alto) {
		return (ancho*2)+(alto*2);
	}
	
	public static double areaRectangulo(double ancho, double alto) {
		return ancho*alto;
	}
	
	public static void main(String[] args) {
		
		double ancho, alto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce parámetros para calcular el área y perímetro de un rectángulo:");
		System.out.print("Alto: ");
		alto = sc.nextDouble();
		System.out.print("Ancho: ");
		ancho = sc.nextDouble();
		
		System.out.println("-------------------------");
		System.out.println("El área del rectángulo es " +areaRectangulo(ancho, alto));
		System.out.println("El perímetro del rectángulo es " +perimetroRectangulo(ancho, alto));
		
	}

}
