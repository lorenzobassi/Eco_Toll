package casello;

/*Solleva un'eccezione se la distanza dal km 0 dell'autostrada è minore di 0*/

public class DistanzaErrata extends Exception {
	
	
	private static final long serialVersionUID = 1L;

		DistanzaErrata(){
		    System.out.println("Errore: la distanza non può essere negativa.");
		  }
		}