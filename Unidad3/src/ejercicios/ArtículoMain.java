package ejercicios;

public class ArtículoMain {

	public static void main(String[] args) {

		Artículo maleta = new Artículo("Maleta", 20, 15);
		Artículo zapatillas = new Artículo("Zapatillas", 50, 12);

		System.out.println(maleta.getNombre() + " - " + "Precio:" + maleta.getPrecio() + "€ - IVA: 21% - PVP:"
				+ (maleta.getPrecio() * maleta.getIva()) + "€");
		System.out.println(zapatillas.getNombre() + " - " + "Precio:" + zapatillas.getPrecio() + "€ - IVA: 21% - PVP:"
				+ (zapatillas.getPrecio() * zapatillas.getIva()) + "€");
	}
}