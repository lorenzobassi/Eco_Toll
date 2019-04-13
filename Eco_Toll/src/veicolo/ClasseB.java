package veicolo;

/*
 * 
 *  Veicoli pesanti con 2 assi e altezza maggiore di m.1.30.
 *  
 */

public class ClasseB extends Veicolo{

	public ClasseB (String m, String mrc, String t, int a, int as, double tar, double p, double h) throws AltezzaErrata{
	
	this.modello = m;
	this.marca = mrc;
	this.targa = t;
	this.anno = a;
	this.assi = 2;
	this.tariffa=0.4;
	this.peso = p;
	this.altezza = h;
	
		if (h<=1.30) {
			throw new AltezzaErrata();
		}
		
		if(as!=2) {
			System.out.println("Il numero di assi è stato settato a 2 perché il veicolo è di classe B.");
		}
	}
	
	
}
