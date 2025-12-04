package ejercicios;

public class Emisora {

	private double frecuencia = 80, cambioF = 0.5;
	private static final double MIN = 80.0;
	private static final double MAX = 108.0;

	public double upF() {
		double frecuenciaN = frecuencia + cambioF;
		if (frecuenciaN > MAX) {
			frecuenciaN = MIN;
		}
		return frecuenciaN;
	}
	
	public double downF() {
		double frecuenciaN = frecuencia - cambioF;
		if (frecuenciaN < MIN) {
			frecuenciaN = MAX;
		}
		return frecuenciaN;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	public void displayF() {
		System.out.println("Te encuentras en la frecuencia " + this.getFrecuencia() + "Mhz");
	}

	public void exitF() {
		System.out.println("--------------------------------------");
		System.out.println(this.getFrecuencia() + "Mhz. Gracias por usar mi radio morrocotuda");
		System.out.println("--------------------------------------");
	}
}