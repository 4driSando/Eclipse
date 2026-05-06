package app;

import utils.Calculadora;

public class App {

	public static void main(String[] args) {
		
		int ocho = 8, dieciseis = 16;
		
		Calculadora calculadora = new Calculadora(dieciseis, ocho);
		
		int suma = calculadora.suma();
		int resta = calculadora.resta();
		int producto = calculadora.producto();
		int division = calculadora.division();
		int potencia = calculadora.potencia();
		int raiz = calculadora.raiz();
		
		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nProducto: " + producto +"\nDivisión: " + division + "\nPotencia: " + potencia + "\nRaiz: " + raiz);

	}

}
