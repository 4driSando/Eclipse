package ejercicios;

public class Rectángulo {

	private int x1, y1, x2, y2;

	public Rectángulo(int x1, int x2, int y1, int y2) {
		if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo: coordenadas inválidas.");
        }
	}
	
	void setX1(int inputX1) {
		x1 = inputX1;
//		this.x1 = x1
	}

	int getX1() {
		return x1;
	}

	void setY1(int inputY1) {
		y1 = inputY1;
	}

	int getY1() {
		return y1;
	}

	void setX2(int inputX2) {
		x2 = inputX2;
	}

	int getX2() {
		return x2;
	}

	void setY2(int inputY2) {
		y2 = inputY2;
	}

	int getY2() {
		return y2;
	}
}
