package personas;

public class Persona {
	
	String n;
    int edad;
    String numeroDeTelefono;
    Prest[] prestamos;
    int numPrestamos = 0;

    public Persona(String n, int edad) {
        this.n = n;
        this.edad = edad;
        prestamos = new Prest[10];
    }
    
    public void addPrestamo(Prest p) {
    	prestamos[numPrestamos] = p;
    	numPrestamos++;
    }
    
    public void pSP (){
        System.out.println("Nombre: "+ n);
        System.out.println("Edad: "+ edad);
        System.out.println("Teléfono: "+ numeroDeTelefono);
    }
    
     public void pTI (){
        System.out.println("Nombre: "+ n);
        System.out.println("Edad: "+ edad);
        System.out.println("Teléfono: "+ numeroDeTelefono);
        
        System.out.println();
        System.out.println("  Préstamos:");
        System.out.println("---------------------");
        for (int i=0; i < numPrestamos; i++){
            prestamos[i].pTInfo();
        }
     }

}
