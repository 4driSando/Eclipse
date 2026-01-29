package ejercicios;

public class Rectangulo {

	private Punto p1;
	private Punto p2;

	public Rectangulo(Punto p1, Punto p2) {
		setP1(p1);
		setP2(p2);
	}

	@Override
	public String toString() {
		return "Rectángulo p1=" + p1 + ", p2=" + p2;
	}

	public int calculaArea(Punto p1, Punto p2) {
		int ladoA = 0;
		int ladoB = 0;

		if (p1.getY() > p2.getY()) {
			ladoA = (p1.getY() - p2.getY());
		} else if (p2.getY() > p1.getY()) {
			ladoA = (p2.getY() - p1.getY());
		} else if (p1.getY() == p2.getY()) {
			ladoA = 0;
		}

		if (p1.getX() > p2.getX()) {
			ladoB = (p1.getX() - p2.getX());
		} else if (p2.getX() > p1.getX()) {
			ladoB = (p2.getX() - p1.getX());
		} else if (p1.getX() == p2.getX()) {
			ladoB = 0;
		}

		int area = (ladoA * ladoB);
		return area;
	}

	public int calculaPerimetro(Punto p1, Punto p2) {
		int ladoA = 0;
		int ladoB = 0;

		if (p1.getY() > p2.getY()) {
			ladoA = (p1.getY() - p2.getY());
		} else if (p2.getY() > p1.getY()) {
			ladoA = (p2.getY() - p1.getY());
		} else if (p1.getY() == p2.getY()) {
			ladoA = 0;
		}

		if (p1.getX() > p2.getX()) {
			ladoB = (p1.getX() - p2.getX());
		} else if (p2.getX() > p1.getX()) {
			ladoB = (p2.getX() - p1.getX());
		} else if (p1.getX() == p2.getX()) {
			ladoB = 0;
		}

		int perimetro = (ladoA * 2) + (ladoB * 2);
		return perimetro;
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
