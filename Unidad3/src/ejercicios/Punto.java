package ejercicios;

public class Punto {

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	private int x, y;

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
	 * Imprime las coordenadas (x, y)
	 **/
	public void mostrarCoords() {
		System.out.println("X=" + getX() + ", Y=" + getY());
	}
	
	/**
	 * Doble setter para cambiar valores
	 * **/
	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	/**
	 * Función para desplazar coordenadas
	 * **/
	public void desplaza(int dx, int dy) {
		setX(x + dx);
		setY(y + dy);
	}
	
}
