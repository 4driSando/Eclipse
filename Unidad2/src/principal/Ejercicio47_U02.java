package principal;

public class Ejercicio47_U02 {

	public static void main(String[] args) {

		int[] números = new int[10];
		números[0] = 39;
		números[1] = 4;
		números[4] = -5;
		números[8] = 32;
			
		System.out.print("| ");
		
		for(int i = 0; i < números.length; i++) {
			System.out.print(números[i]+" | ");
		}
	}
}