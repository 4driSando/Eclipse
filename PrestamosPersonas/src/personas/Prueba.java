package personas;

public class Prueba {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", 35);
		Prest prestamo1 = new Prest(1000);
		p1.addPrestamo(prestamo1);
		
		p1.pTI();
		System.out.println("Número de préstamos: " + p1.numPrestamos);
	}

}
