package ejercicios;

public class RectánguloMain {

	public static void main(String[] args) {

		Rectángulo R1 = new Rectángulo(0, 5, 0, 5);
		Rectángulo R2 = new Rectángulo(7, 2, 9, 3);
		

		int ladoA = (R1.getY2() - R1.getY1());
		int ladoB = (R1.getX2() - R1.getX1());
		int ladoA2 = (R2.getY1() - R2.getY2());
		int ladoB2 = (R2.getX1() - R2.getX2());

		int perímetro1 = (ladoA * 2) + (ladoB * 2);
		int perímetro2 = (ladoA2 * 2) + (ladoB2 * 2);
		int área1 = (ladoA*ladoB);
		int área2 = (ladoA2*ladoB2);
		
		System.out.println("Primer Rectángulo");
		System.out.println("-----------------");
		System.out.println("Sus coordenadas son (x1=" + R1.getX1() + ", y1=" + R1.getY1()+ "),(x2=" + R1.getX2() + ", y2=" + R1.getY2() + ")");
		System.out.println("Su perímetro es " + perímetro1);
		System.out.println("Su área es " + área1);
		System.out.println("\nSegundo Rectángulo");
		System.out.println("------------------");
		System.out.println("Sus coordenadas son (x1=" + R2.getX1() + ", y1=" + R2.getY1()+ "),(x2=" + R2.getX2() + ", y2=" + R2.getY2() + ")");
		System.out.println("Su perímetro es " + perímetro2);
		System.out.println("Su área es " + área2);

	}
}