package principal;
import java.util.Scanner;
public class Ejercicio10_U02 {
	public static void main(String[] args) {

		int hora;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qué hora es? (en formato 24h):");
		hora = sc.nextInt();

		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días por la mañana, coleguita!! :P");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes por la tarde, coleguita!! :P");
		} else if (hora >= 0 && hora <= 5 || hora >= 21 && hora <= 24) {
			System.out.println("Buenos noches por la noche, coleguita!! :P");
		} else {
			System.err.println("Esa hora no existe XP");
		}
	}
}