package app;

import utils.GestorNotas;

public class Main {

	public static void main(String[] args) {
		
		String pepe = "Pepe";
		int[] notasPepe = {3, 5, 6, 7, 1};
		
		GestorNotas boletinPepe = new GestorNotas(pepe, notasPepe);
		
		double mediaPepe = boletinPepe.calcularMedia();
		int notaMax = boletinPepe.obtenerNotaMaxima();
		int notaMin = boletinPepe.obtenerNotaMinima();
		boolean aprobado = boletinPepe.estaAprobado();
		String evaluacion = boletinPepe.obtenerCalificacion();
		
		System.out.println("Notas de Pepe");
		System.out.println("Media: " + mediaPepe);
		System.out.println("Nota Máxima: " + notaMax);
		System.out.println("Nota Mínima: " + notaMin);
		System.out.println("Está aprobado? " + aprobado);
		System.out.println(evaluacion);


	}

}
