package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora(16, 8);
		int suma = calculadora.suma();
		int sumaEsperada = 16 + 8;
		assertEquals(sumaEsperada, suma, "La suma no es correcta");
	}

	@Test
	void testResta() {
		Calculadora calculadora = new Calculadora(16, 8);
		int resta = calculadora.resta();
		int restaEsperada = 16 - 8;
		assertEquals(restaEsperada, resta, "La resta no es correcta");
	}

	@Test
	void testProducto() {
		Calculadora calculadora = new Calculadora(16, 8);
		int producto = calculadora.producto();
		int productoEsperado = 16 * 8;
		assertEquals(productoEsperado, producto, "El producto no es correcto");
	}

	@Test
	void testDivision() {
		Calculadora calculadora = new Calculadora(16, 8);
		int division = calculadora.division();
		int divisionEsperado = 16 / 8;
		assertEquals(divisionEsperado, division, "La división no es correcta");
	}

	@Test
	void testRaiz() {
		Calculadora calculadora = new Calculadora(64, 3);
		int raiz = calculadora.raiz();
		int raizEsperada = 3;
		assertEquals(raizEsperada, raiz, "La raiz no es correcta");
	}
	

} 
