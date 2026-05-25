package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorNotasTest {

	@Test
	void testCalcularMedia() {
		int[] notasPepe = {6, 8, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		double mediaEsperada = 6;
		
		assertEquals(mediaEsperada, boletin.calcularMedia(), "La media no es correcta");
	}

	@Test
	void testObtenerNotaMaxima() {
		int[] notasPepe = {6, 8, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		int notaMaxEsperada = 8;
		
		assertEquals(notaMaxEsperada, boletin.obtenerNotaMaxima(), "La nota máxima no es correcta");
	}

	@Test
	void testObtenerNotaMinima() {
		int[] notasPepe = {6, 8, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		int notaMinEsperada = 4;
		
		assertEquals(notaMinEsperada, boletin.obtenerNotaMinima(), "La nota mínima no es correcta");
	}

	@Test
	void testEstaAprobado() {
		int[] notasPepe = {6, 8, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		
		assertTrue(boletin.estaAprobado(), "Debería estar aprobado");
	}
	
	@Test
	void testEstaSuspenso() {
		int[] notasPepe = {6, 2, 1, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		
		assertFalse(boletin.estaAprobado(), "Debería estar suspenso");
	}

	@Test
	void testObtenerCalificacionSuspenso() {
		int[] notasPepe = {4, 2, 1, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);
		
		assertEquals("Suspenso", boletin.obtenerCalificacion(), "Debería de mostrar suspenso");
	}
	
	@Test
	void testObtenerCalificacionSuficiente() {
		int[] notasPepe = {6, 4, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);

		assertEquals("Suficiente", boletin.obtenerCalificacion(), "Debería de mostrar suficiente");
	}
	
	@Test
	void testObtenerCalificacionBien() {
		int[] notasPepe = {6, 8, 6, 4};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);

		assertEquals("Bien", boletin.obtenerCalificacion(), "Debería de mostrar bien");
	}
	
	@Test
	void testObtenerCalificacionNotable() {
		int[] notasPepe = {6, 8, 6, 6, 9};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);

		assertEquals("Notable", boletin.obtenerCalificacion(), "Debería de mostrar notable");
	}
	
	@Test
	void testObtenerCalificacionSobresaliente() {
		int[] notasPepe = {10, 8, 8, 10, 9};
		GestorNotas boletin = new GestorNotas("Pepe", notasPepe);

		assertEquals("Sobresaliente", boletin.obtenerCalificacion(), "Debería de mostrar sobresaliente");
	}

}
