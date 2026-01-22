package app;

import utils.*;

public class App {

	public static void main(String[] args) {

		Password passw = new Password();
		int a = 10;
		int b = 5;
		String contraseña = "Sandoval25092006";
		Calculadora calc = new Calculadora(a, b);
		
		System.out.println("La suma de " + a + " más " + b + " es " + calc.suma());

		System.out.println(Password.esSegura(contraseña));
	
	}

}