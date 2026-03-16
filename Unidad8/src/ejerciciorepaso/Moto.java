package ejerciciorepaso;

public class Moto extends Vehiculo {

	// Constructor
	public Moto(String matricula, String modelo, double costeReparacion) throws Exception {
		super(matricula, modelo, costeReparacion);
	}

	// Método abstracto
	@Override
	public String obtenerInformeMantenimiento() {
		return "Engrase de cadena y revisión de frenos de la moto " + this.getModelo();
	}

	
}
