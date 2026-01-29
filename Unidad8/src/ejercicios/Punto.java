package ejercicios;

public class Punto {

	private int x, y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;	
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	void setX(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

	void setY(int y) {
		this.y = y;
	}

	int getY() {
		return y;
	}

	/**
	 * Doble setter para cambiar valores
	 */
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * Función para desplazar coordenadas
	 */
	public void desplaza(int dx, int dy) {
		setX(x + dx);
		setY(y + dy);
	}
	
}
