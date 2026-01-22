package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordTest {
	
	@Test
	void testEsSeguraNull() {	
		boolean resultado = Password.esSegura(null);
		assertFalse(resultado, "La password no tiene que ser null");
	}
	
	@Test
	void testEsSeguraCorta() {	
		boolean resultado = Password.esSegura("Sando");
		assertFalse(resultado, "La password no tiene que ser menor de 8 carácteres de longitud");
	}
	
	@Test
	void testEsSeguraEspacio() {	
		boolean resultado = Password.esSegura("Sando val");
		assertFalse(resultado, "La password no puede tener espacios");
	}
	
	@Test
	void testEsSeguraSinEspecial() {	
		boolean resultado = Password.esSegura("Sandoval");
		assertFalse(resultado, "La password tiene que incluir al menos uno de estos (?!@#$)");
	}
	
	@Test
	void testEsSeguraEspecial() {	
		boolean resultado = Password.esSegura("Sandoval??");
		assertTrue(resultado, "La password tiene que incluir al menos uno de estos (?!@#$)");
	}
}
