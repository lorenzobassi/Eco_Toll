package veicolo;

/*
 * 
 *  Veicoli pesanti con 5 o più assi.
 *  
 */

public class ClasseE extends Veicolo{
	
	public ClasseE (String m, String mrc, String t, int a, int as,double tar, double p, double h) throws NumeroAssi{
		
		this.modello = m;
		this.marca = mrc;
		this.targa = t;
		this.anno = a;
		this.assi = as;
		this.tariffa=1;
		this.peso = p;
		this.altezza = h;
		
		if (as<5) {
			throw new NumeroAssi();
		}
	}
	
	
}
