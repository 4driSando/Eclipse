package interfaces;

public class Cuadrado implements Figura2D {

	private double lado;
	
	public Cuadrado(double lado) {
		this.setLado(lado);
	}

	public double perimetro() {
		return this.lado*4;
	}

	public double area() {
		return this.lado*this.lado;
	}

	public void escalar(double escala) {
		this.lado = this.lado+escala;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

}
