package ejercicios;

import java.time.LocalDate;

public class Revista extends Publicacion {

	private int numRevista;
	
	public Revista(String codigo, String titulo, LocalDate fechaPublic, int paginas, int numRevista) {
		super(codigo, titulo, fechaPublic, paginas);
		this.setNumRevista(numRevista);
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Revista [numRevista=" + numRevista + "]";
	}

	public int getNumRevista() {
		return numRevista;
	}
	
	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}

}
