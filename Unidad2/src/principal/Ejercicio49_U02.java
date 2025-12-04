package principal;

public class Ejercicio49_U02 {

	public static void main(String[] args) {

		int[] num = new int[15];
		int[] num2 = new int[15];
		
		System.out.println("15 números random y sus respectivos cuadrados");
		System.out.println("Random--Random^2");

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
			num2[i] = num[i] * num[i];
			System.out.println(num[i] + "\t" + num2[i]);
		}
	}
}