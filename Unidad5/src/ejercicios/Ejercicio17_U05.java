package ejercicios;

public class Ejercicio17_U05 {

	public static void main(String[] args) {

		int[][] num = new int[3][6];
		num[1][0] = 75;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[0][5] = 7;
		num[2][5] = 11;
		
		for (int i = 0; i < num[0].length; i++) {
			System.out.print("\t Columna " + i + " ");
		}
		
		System.out.println("");
		
		for (int fila = 0; fila < num.length; fila++) {
			System.out.print("Fila " + fila);
			for (int columna = 0; columna < num[fila].length; columna++) {
				System.out.print("\t     " + num[fila][columna] + "\t");
			}
			System.out.println("");
		}
	}

}
