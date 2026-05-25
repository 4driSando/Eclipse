package utils;

public class GestorNotas {

	private String alumno;
	private int[] notas;

	/**
	 * Constructor. Lanza IllegalArgumentException si alguna nota está fuera del
	 * rango [0, 10].
	 */
	public GestorNotas(String alumno, int[] notas) {
		for (int nota : notas) {
			if (nota < 0 || nota > 10) {
				throw new IllegalArgumentException("Nota fuera de rango [0-10]: " + nota);
			}
		}
		this.alumno = alumno;
		this.notas = notas;
	}

	/** Devuelve el nombre del alumno. */
	public String getAlumno() {
		return alumno;
	}

	/** Calcula y devuelve la media aritmética de las notas. */
	public double calcularMedia() {
		int suma = 0;
		for (int nota : notas) {
			suma += nota;
		}
		return (double) suma / notas.length;
	}

	/** Devuelve la nota más alta del alumno. */
	public int obtenerNotaMaxima() {
		int max = notas[0];
		for (int nota : notas) {
			if (nota > max)
				max = nota;
		}
		return max;
	}

	/** Devuelve la nota más baja del alumno. */
	public int obtenerNotaMinima() {
		int min = notas[0];
		for (int nota : notas) {
			if (nota < min)
				min = nota;
		}
		return min;
	}

	/**
	 * Devuelve true si la media es >= 5 (aprobado), false en caso contrario
	 * (suspenso).
	 */
	public boolean estaAprobado() {
		return calcularMedia() >= 5;
	}

	/**
	 * Devuelve la calificación en texto según la media: < 5 → "Suspenso" 5-5.9 →
	 * "Suficiente" 6-6.9 → "Bien" 7-8.9 → "Notable" >= 9 → "Sobresaliente"
	 */
	public String obtenerCalificacion() {
		double media = calcularMedia();
		if (media < 5)
			return "Suspenso";
		else if (media < 6)
			return "Suficiente";
		else if (media < 7)
			return "Bien";
		else if (media < 9)
			return "Notable";
		else
			return "Sobresaliente";
	}
}