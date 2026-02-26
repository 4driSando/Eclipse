package ejercicios;

public abstract class Terrestre extends Vehiculo {

	protected int ruedas;

	public Terrestre(String matricula, String modelo, int ruedas) {
		super(matricula, modelo);
		setRuedas(ruedas);
	}

	/**
	 * Método que devuelve el tipo de vehículo que es
	 * 
	 * @return String con el tipo de vehículo
	 */
	public abstract String tipoVehiculo();

	@Override
	public boolean validarMatricula() {
		return matricula.matches("[0-9]{4}[A-Z]{3}");
	}

	// Getters & Setters
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
        if (ruedas <= 0) {
            throw new IllegalArgumentException("El nº de ruedas no puede ser negativo ni cero");
        }
		this.ruedas = ruedas;
	}

}
