package ejercicios;

public class Moto extends Terrestre {

	private String color;

	public Moto(String matricula, String modelo, int ruedas, String color) {
		super(matricula, modelo, ruedas);
		this.color = color;
		if (!validarMatricula()) {
			throw new IllegalArgumentException("Matrícula no válida");
		}
	}

	@Override
	public String toString() {
		return "\nMOTO\nMatrícula: " + matricula + "\nModelo: " + modelo + "\nRuedas: " + ruedas + "\nColor: " + color;
	}

	@Override
	public String tipoVehiculo() {
		return "Moto";
	}

	// Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
