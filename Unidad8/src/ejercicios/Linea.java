package ejercicios;

public class Linea {

	private Punto p1;
	private Punto p2;

	public Linea(Punto p1, Punto p2) {
		setP1(p1);
		setP2(p2);
	}

	@Override
	public String toString() {
		return "Linea p1=" + p1 + ", p2=" + p2;
	}

	public int calculaDistancia(int x1, int x2) {
		int distancia = 0;
		if (x1 > x2) {
			distancia = x1 - x2;
		} else if (x2 > x1) {
			distancia = x2 - x1;
		} else if (x1 == x2) {
			distancia = 0;
		}
		return distancia;
	}

	public Punto getP1() {
		return p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

}