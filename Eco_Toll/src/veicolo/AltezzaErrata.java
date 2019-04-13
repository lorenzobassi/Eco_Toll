package veicolo;

/* solleva un'eccezione in caso l'altezza del veicolo
 * nella classe A e B non rispetti il regolamento.*/


public class AltezzaErrata extends Exception {

	
	private static final long serialVersionUID = 1L;

	AltezzaErrata(){
	    System.out.println("Errore: l 'altezza è errata.");
	  }
	}