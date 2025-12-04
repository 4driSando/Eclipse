package principal;
import java.util.Scanner;
public class Ejercicio23_U02 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce un número del 1 al 9 y verás su tabla de multiplicar:");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}