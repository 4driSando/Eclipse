package principal;

import java.util.*;

public class Ejercicio50_U02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[12];
		int numIntroducido;
		
		System.out.println("Introduce 12 números para saber si son pares o impares:");

		for(int i= 0; i<num.length; i++) {
			numIntroducido = sc.nextInt();
			num[i] = numIntroducido;
		}
		
		for(int i = 0; i<num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.println("Par: " + num[i]);
			}
		}
		
		for(int i =0; i < num.length; i++) {
			if(num[i] % 2 != 0) {
				System.out.println("Impar: " + num[i]);
			}
		}
		sc.close();
	}
}
