package app;

import utils.Calculadora;

public class App {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		Calculadora calc = new Calculadora(a, b);
		
		System.out.println("La suma de " + a + " más " + b + " es " + calc.suma());
	}

}