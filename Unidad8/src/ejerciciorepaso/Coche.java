package ejerciciorepaso;

public class Coche extends Vehiculo implements Electrico {

	// Atributos
	private boolean esElectrico;

	// Constructores
	// Constructor para coche normal
	public Coche(String matricula, String modelo, double costeReparacion) throws Exception {
		super(matricula, modelo, costeReparacion);
		this.esElectrico = false;
	}

	// Constructor para coche eléctrico
	public Coche(String matricula, String modelo, double costeReparacion, boolean esElectrico) throws Exception {
		super(matricula, modelo, costeReparacion);
		this.esElectrico = esElectrico;
	}

	// Getter y Setters
	public boolean isEsElectrico() {
		return esElectrico;
	}

	public void setEsElectrico(boolean esElectrico) {
		this.esElectrico = esElectrico;
	}

	// toString
	@Override
	public String toString() {
	    return "Coche - " + getModelo() +
	           "\nMatrícula: " + getMatricula() +
	           "\nCoste: " + getCosteReparacion() +
	           "\nEléctrico: " + isEsElectrico();
	}
	
	// Método abstracto
	@Override
	public String obtenerInformeMantenimiento() {
		return "Revisión de neumáticos y niveles del coche " + this.getModelo();
	}

	// Método de la interface
	@Override
	public String recargarBateria() {
		if (esElectrico) {
			return "Batería del coche " + this.getModelo() + " recargada correctamente";
		} else {
			return "Este coche no es eléctrico";
		}
	}

}
