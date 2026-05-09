package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordTest {

	@Test
	void testEsFalsaLongitud() {
		String psswd = "Lobatón";
		assertEquals(false, Password.esSegura(psswd), "La longitud tiene que ser mayor");
	}
	
	@Test
	void testNoNull() {
		String psswd = null;
		assertEquals(false, Password.esSegura(psswd), "No puede ser null");
	}
	
	@Test
	void testEsFalsaEspacio() {
		String psswd = "Lob atón";
		assertEquals(false, Password.esSegura(psswd), "No pueden haber espacios");
	}
	
	@Test
	void testEsFalsaSinChar() {
		String psswd = "Lobatoide";
		assertEquals(false, Password.esSegura(psswd), "Necesita un carácter para ser válida");
	}
	
	@Test
	void testEsCorrecta() {
		String psswd = "Lob@toide";
		assertEquals(true, Password.esSegura(psswd), "+8 chars, sin espacios y con un char especial");
	}

}
