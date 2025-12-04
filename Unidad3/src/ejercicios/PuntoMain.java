package ejercicios;

public class PuntoMain {

	public static void main(String[] args) {

		Punto p_1 = new Punto(5, 0);
		Punto p_2 = new Punto(10, 10);
		Punto p_3 = new Punto(-3, 7);

		System.out.println("Coordenadas");
		p_1.mostrarCoords();
		p_2.mostrarCoords();
		p_3.mostrarCoords();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Cambiamos las coordenadas con el doble setter");
		p_1.setXY(0, 5);
		p_2.setXY(3, 7);
		p_3.setXY(9, 2);
		p_1.mostrarCoords();
		p_2.mostrarCoords();
		p_3.mostrarCoords();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Cambiamos las coordenadas con el desplaza");
		p_1.desplaza(2, 1);
		p_2.desplaza(9, 8);
		p_3.desplaza(0, 3);
		p_1.mostrarCoords();
		p_2.mostrarCoords();
		p_3.mostrarCoords();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Calculamos la distancia de los distintos puntos");
		
	}

}