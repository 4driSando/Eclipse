package ejercicios;

import java.util.ArrayList;

public class EmpresaAgro {

	private String nombre;
	private String cif;
	private ArrayList<Object> productos = new ArrayList<Object>();
	
	// Constructor
	public EmpresaAgro(String nombre, String cif, ArrayList<Object> productos) {
		this.nombre = nombre;
		this.cif = cif;
		setProductos(productos);
	}
	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public String getCif() {
		return cif;
	}
	public ArrayList<Object> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Object> productos) {
		this.productos = productos;
	}
	
	

	
}
