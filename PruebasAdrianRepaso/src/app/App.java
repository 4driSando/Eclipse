package app;

import utils.Calculadora;
import utils.Password;
import utils.Tarifa;

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
		
		System.out.println("CALCULADORA");
		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nProducto: " + producto +"\nDivisión: " + division + "\nPotencia: " + potencia + "\nRaiz: " + raiz);
		
		String psswd = "Lobatón";
		String psswd2 = "Loba tón";
		String psswd3 = "Lobatoide";
		String psswd4 = "Lob@toide";
		
		System.out.println("\nCONTRASEÑA");
		System.out.println("Son seguras las siguientes contraseñas?");
		System.out.println(psswd + " => " + Password.esSegura(psswd));
		System.out.println(psswd2 + " => " + Password.esSegura(psswd2));
		System.out.println(psswd3 + " => " + Password.esSegura(psswd3));
		System.out.println(psswd4 + " => " + Password.esSegura(psswd4));
		
		int edadCarla = 15;
		int edadRuth = 45;
		int edadGallego = 89;
		System.out.println("\nTARIFA");
		System.out.println("Carla paga " + Tarifa.calcularPrecioMensual(edadCarla));
		System.out.println("Ruth paga " + Tarifa.calcularPrecioMensual(edadRuth));
		System.out.println("El Gallego paga " + Tarifa.calcularPrecioMensual(edadGallego));



	}

}
