package principal;

import java.util.Scanner;

public class Ejercicio25_U02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pnum = 0;
		int snum = 1;
		int numveces = 0;
		int numveces2;

		System.out.println("Introduce cuántos términos de la serie de fibonacci quieres ver");
		numveces2 = sc.nextInt();

		do {
			System.out.println(pnum);
			int suma = pnum + snum;
			pnum = snum;
			snum = suma;
			numveces++;
		} while (numveces < numveces2);
	}
}