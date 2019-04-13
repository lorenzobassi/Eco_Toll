package veicolo;


/* solleva un'eccezione per la classe E
 * in caso il numero degli assi del veicolo 
 * non rispetti il regolamento (>5)*/


public class NumeroAssi extends Exception {


	private static final long serialVersionUID = 1L;

	NumeroAssi(){
	    System.out.println("Errore: il numero di assi è errato.");
	  }
	}