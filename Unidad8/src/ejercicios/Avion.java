package ejercicios;

public class Avion extends Aereo {

	private int tiempoVuelo;

	public Avion(String matricula, String modelo, int asientos, int tiempoVuelo) {
		super(matricula, modelo, asientos);
		this.tiempoVuelo = tiempoVuelo;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String toString() {
		return "\nAVIÓN\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nNº Asientos: " + asientos
				+ "\nTiempo de vuelo: " + tiempoVuelo;
	}

	@Override
	public String tipoVehiculo() {
		return "Avión";
	}

	// Getters & Setters
	public int getTiempoVuelo() {
		return tiempoVuelo;
	}

	public void setTiempoVuelo(int tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}

}
