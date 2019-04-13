package casello;

/*
 * Gestisce un casello con la relativa distanza dal km 0 dell'autostrada;
 */

public class Casello {
	String nome;
	int distanza;
	
	public Casello(String n,int d) throws DistanzaErrata{
		this.nome=n;
		this.distanza=d;
		
		if (d<0) {
			throw new DistanzaErrata();
		}
	}

	public String getNome() {
		return nome;
	}

	public int getDistanza() {
		return distanza;
	}

	public int kmPercorsi(Casello a) {
		
		return Math.abs(this.distanza - a.getDistanza());	/* Distanza in valore assoluto*/
															
	}


}
