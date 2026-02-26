package ejercicios;

public abstract class Vehiculo {

	protected String matricula;
	protected String modelo;

	public Vehiculo(String matricula, String modelo) {
		setMatricula(matricula);
		setModelo(modelo);
	}

	/**
	 * Método para validar la matrícula dependiendo del vehículo
	 * 
	 * @return True o False dependiendo de si es válida o no
	 */
	public abstract boolean validarMatricula();
	protected abstract String tipoVehiculo();

	// Getters & Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("La matricula no puede ser nula ni vacío");
        }
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo ni vacío");
        }
		this.modelo = modelo;
	}


}
