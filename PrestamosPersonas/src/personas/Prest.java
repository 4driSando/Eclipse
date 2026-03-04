package personas;

public class Prest {
	
	int c;
	
	public Prest(int c) {
		this.c = c;
	}
	
    public void pTInfo() {
    	
    	//Duración por defecto
    	int d = 2;
    	
        System.out.println("Cantidad: "+ c + " euros");
        System.out.println("Duración: "+ d + " años");
    }

}
