package principal;

import java.util.*;

public class Ejercicio56_U02 {

    public static void main(String[] args) {

        /*
         * Pedir dos números N y M
         * Crear un array de tamaño N y rellenarlo con el número M
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números enteros:");
        System.out.print("N (tamaño del array): ");
        int tamañoN = sc.nextInt();

        System.out.print("M (valor a repetir): ");
        int M = sc.nextInt();

        int[] N = new int[tamañoN];

        for (int i = 0; i < N.length; i++) {
            N[i] = M;
        }

        System.out.println("Contenido del array:");
        System.out.print("| ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " | ");
        }
    }
}
