package recursividad;

public class Ejercicio2 {

	public static void main(String[] args) {
			
		int[] array1 = new int[10];
		
		for (int i = 0; i < array1.length; i++) {
			int aleatorio = (int) (Math.random() * (20 - 1 + 1)) + 1;
			array1[i] = aleatorio;
		}
			
		recorreArray(array1, array1.length - 1);
		devolverMax(array1, array1.length - 1);
	
	}
	
	static void recorreArray(int[] array, int i) {
	    System.out.print(array[i] + ", ");

	    if (i == 0) {
	        System.out.println("Terminado");
	    } else {
	        recorreArray(array, i - 1);
	    }
	}
	
	static void devolverMax(int[] array, int i) {
		
		int maximo = array[i];
		
		if(maximo < array[(i-1)]) {
			devolverMax(array, i-1);
		}
		
		System.out.println(maximo);
	}

}
