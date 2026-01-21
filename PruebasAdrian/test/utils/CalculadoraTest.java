package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.suma();
		assertEquals(resultado, 8);
	}

	@Test
	void testResta() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.resta();
		assertEquals(resultado, 4);
		}

	@Test
	void testProducto() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.producto();
		assertEquals(resultado, 12);
		}

	@Test
	void testDivision() {
		Calculadora calculadora = new Calculadora(6,2);
		int resultado = calculadora.division();
		assertEquals(resultado, 3);
		}
}